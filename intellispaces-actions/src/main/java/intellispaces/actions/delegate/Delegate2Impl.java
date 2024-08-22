package intellispaces.actions.delegate;

import intellispaces.actions.AbstractAction2;
import intellispaces.actions.Action2;
import intellispaces.actions.getter.Getter;

class Delegate2Impl<R, D1, D2> extends AbstractAction2<R, D1, D2> implements Delegate2<R, D1, D2> {
  private final Getter<Action2<R, D1, D2>> contractor;

  Delegate2Impl(Getter<Action2<R, D1, D2>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D1 data1, D2 data2) {
    return contractor.get().execute(data1, data2);
  }

  @Override
  public Getter<Action2<R, D1, D2>> contractor() {
    return contractor;
  }
}