package intellispaces.actions.common.string;

import intellispaces.actions.Actions;
import intellispaces.actions.interceptor.skipping.SkippingInterceptors;
import intellispaces.actions.processor.Processor1;
import intellispaces.actions.runner.Runner;

public final class StringActions {

  private StringActions() {}

  public static Processor1<StringBuilder> commaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR);
  }

  public static Runner commaAppender(StringBuilder sb) {
    Processor1<StringBuilder> commaAppender = commaAppender();
    return Actions.runner(commaAppender::process, sb);
  }

  public static Runner commaAppender(StringBuilder sb1, StringBuilder sb2) {
    return commaAppender(sb1)
        .then(commaAppender(sb2));
  }

  public static Processor1<StringBuilder> skippingFirstTimeCommaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR)
        .wrapAction1AsProcessor(SkippingInterceptors.skippingFirstTimeInterceptorFactory1());
  }

  public static Runner skippingFirstTimeCommaAppender(StringBuilder sb) {
    return commaAppender(sb)
        .wrapAction0AsRunner(SkippingInterceptors.skippingFirstTimeInterceptorFactory0());
  }

  public static Runner skippingFirstTimeCommaAppender(StringBuilder sb1, StringBuilder sb2) {
    return skippingFirstTimeCommaAppender(sb1)
        .then(skippingFirstTimeCommaAppender(sb2));
  }

  private static final String COMMA_SEPARATOR = ", ";
}