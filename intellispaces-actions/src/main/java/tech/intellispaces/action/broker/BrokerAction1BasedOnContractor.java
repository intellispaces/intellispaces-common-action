package tech.intellispaces.action.broker;

import tech.intellispaces.action.Action1;
import tech.intellispaces.action.exception.IrregularActionTypeExceptions;
import tech.intellispaces.action.mapper.AbstractMapperAction1;

public class BrokerAction1BasedOnContractor<R, D>
    extends AbstractMapperAction1<Action1<R, D>, D>
    implements BrokerAction1<R, D>
{
  private final Action1<R, D> contractor;

  BrokerAction1BasedOnContractor(Action1<R, D> contractor) {
    this.contractor = contractor;
  }

  @Override
  public Action1<R, D> map(D data) {
    return contractor;
  }

  @Override
  public int mapToInt(D data) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns the action type");
  }

  @Override
  public double mapToDouble(D data) {
    throw IrregularActionTypeExceptions.withMessage("Broker action returns th action type");
  }
}