package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction0;

import java.util.function.Function;

/**
 * Case of the action without processed data.
 *
 * @param <R> action return type.
 */
public interface Action0<R> extends
  Action1<R, Void>,
  Action2<R, Void, Void>,
  Action3<R, Void, Void, Void>,
  Action4<R, Void, Void, Void, Void>,
  Action5<R, Void, Void, Void, Void, Void>
{
  /**
   * Executes action.
   */
  R execute();

  int executeReturnInt();

  double executeReturnDouble();

  <W extends WrapperAction0<_R>, _R> W wrapAction0(Function<Action0<R>, W> wrapperFactory);
}
