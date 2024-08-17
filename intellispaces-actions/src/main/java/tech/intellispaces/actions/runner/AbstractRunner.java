package tech.intellispaces.actions.runner;

import tech.intellispaces.actions.AbstractAction0;
import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.multiaction.MultiActions;
import tech.intellispaces.actions.wrapper.Wrapper0;
import tech.intellispaces.actions.wrapper.Wrapper5;

import java.util.function.Function;

abstract class AbstractRunner extends AbstractAction0<Void> implements Runner {

  @Override
  public Runner then(Action0<Void> otherAction) {
    return new RunnerBasedOnAction5(MultiActions.of(this, otherAction));
  }

  @Override
  public Runner wrapAction0AsRunner(Function<Action0<Void>, Wrapper0<Void>> wrapperFactory) {
    return wrapperFactory.apply(this).wrapAction0(RunnerBasedOnAction0::new);
  }

  @Override
  public Runner wrapAction5AsRunner(
      Function<Action5<Void, Void, Void, Void, Void, Void>, Wrapper5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  ) {
    return wrapperFactory.apply(this).wrapAction5(RunnerBasedOnAction5::new);
  }
}
