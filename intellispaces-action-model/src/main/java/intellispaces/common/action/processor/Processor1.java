package intellispaces.common.action.processor;

import intellispaces.common.action.Action;
import intellispaces.common.action.Action1;
import intellispaces.common.action.wrapper.Wrapper;
import intellispaces.common.action.wrapper.Wrapper1;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Processor action.
 *
 * <p>Processor is action that processes an input data.
 *
 * @param <D> processed data type.
 */
public interface Processor1<D> extends Action1<D, D>, Consumer<D> {

  /**
   * Executes action.
   *
   * @param data input data.
   */
  void process(D data);

  Processor1<D> then(Action1<D, D> otherAction);

  @Override
  default D execute(D value) {
    process(value);
    return value;
  }

  @Override
  default void accept(D value) {
    process(value);
  }

  Processor1<D> wrapActionAsProcessor(Function<Action, Wrapper> wrapperFactory);

  Processor1<D> wrapAction1AsProcessor(Function<Action1<D, D>, Wrapper1<D, D>> wrapperFactory);
}
