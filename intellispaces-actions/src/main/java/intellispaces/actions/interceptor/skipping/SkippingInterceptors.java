package intellispaces.actions.interceptor.skipping;

import intellispaces.actions.Action;
import intellispaces.actions.Action0;
import intellispaces.actions.Action1;
import intellispaces.actions.wrapper.Wrapper;
import intellispaces.actions.wrapper.Wrapper0;
import intellispaces.actions.wrapper.Wrapper1;

import java.util.function.Function;

public interface SkippingInterceptors {

  static Wrapper skippingFirstTimeInterceptor(Action action) {
    return new SkippingFirstTimeInterceptor(action);
  }

  static <R, D> Wrapper1<R, D> skippingFirstTimeInterceptor1(Action1<R, D> action) {
    return new SkippingFirstTimeInterceptor1<>(action);
  }

  static Function<Action, Wrapper> skippingFirstTimeInterceptorFactory() {
    return SkippingFirstTimeInterceptor::new;
  }

  static <R> Function<Action0<R>, Wrapper0<R>> skippingFirstTimeInterceptorFactory0() {
    return SkippingFirstTimeInterceptor0::new;
  }

  static <R, D> Function<Action1<R, D>, Wrapper1<R, D>> skippingFirstTimeInterceptorFactory1() {
    return SkippingFirstTimeInterceptor1::new;
  }
}
