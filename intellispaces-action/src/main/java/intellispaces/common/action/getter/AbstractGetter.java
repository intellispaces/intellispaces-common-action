package intellispaces.common.action.getter;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;
import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.Wrapper0;
import intellispaces.common.action.wrapper.Wrapper5;

import java.util.function.Function;

abstract class AbstractGetter<R> extends AbstractAction0<R> implements Getter<R> {

  @Override
  public Getter<R> wrapAction0AsGetter(Function<Action0<R>, Wrapper0<R>> wrapperFactory) {
    return wrapperFactory.apply(this).wrapAction0(GetterBasedOnAction0::new);
  }

  @Override
  public Getter<R> wrapAction5AsGetter(
      Function<Action5<R, Void, Void, Void, Void, Void>, Wrapper5<R, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(GetterBasedOnAction5::new);
  }
}
