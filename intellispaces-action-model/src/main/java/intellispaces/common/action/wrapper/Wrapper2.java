package intellispaces.common.action.wrapper;

import intellispaces.common.action.Action2;

public interface Wrapper2<R, D1, D2> extends Wrapper, Action2<R, D1, D2> {

  @Override
  Action2<R, D1, D2> wrappedAction();
}
