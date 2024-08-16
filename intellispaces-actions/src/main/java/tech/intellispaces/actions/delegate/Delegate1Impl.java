package tech.intellispaces.actions.delegate;

import tech.intellispaces.actions.AbstractAction1;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.getter.Getter;

class Delegate1Impl<R, D> extends AbstractAction1<R, D> implements Delegate1<R, D> {
  private final Getter<Action1<R, D>> contractor;

  Delegate1Impl(Getter<Action1<R, D>> contractor) {
    this.contractor = contractor;
  }

  @Override
  public R execute(D data) {
    return contractor.get().execute(data);
  }

  @Override
  public Getter<Action1<R, D>> contractor() {
    return contractor;
  }
}
