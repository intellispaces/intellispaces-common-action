package tech.intellispaces.action.processor;

import tech.intellispaces.action.AbstractAction1;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.chain.processor.ChainProcessorActions;
import tech.intellispaces.action.runnable.RunnableAction;
import tech.intellispaces.action.wrapper.WrapperAction1;

import java.util.function.Function;

public abstract class AbstractProcessorAction1<D>
    extends AbstractAction1<Void, D>
    implements ProcessorAction1<D>
{
  @Override
  public Void execute(D data) {
    process(data);
    return null;
  }

  @Override
  public void accept(D data) {
    process(data);
  }

  @Override
  public ProcessorAction1<D> andThen(Action1<Void, D> nextAction) {
    return ProcessorActions.processorAction1(ChainProcessorActions.get(this, nextAction));
  }

  @Override
  public RunnableAction asRunnable(D data) {
    return Actions.runnableAction(this::process, data);
  }

  @Override
  public <W extends WrapperAction1<Void, _D>, _D> ProcessorAction1<_D> wrapProcessorAction1(
      Function<Action1<Void, D>, W> wrapperFactory
  ) {
    return ProcessorActions.processorAction1(wrapperFactory.apply(this));
  }

  @Override
  public int executeReturnInt(D data) {
    throw new UnsupportedOperationException();
  }

  @Override
  public double executeReturnDouble(D data) {
    throw new UnsupportedOperationException();
  }
}