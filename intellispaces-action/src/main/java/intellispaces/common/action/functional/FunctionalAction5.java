package intellispaces.common.action.functional;

import intellispaces.common.action.AbstractAction5;
import intellispaces.common.action.Action5;
import intellispaces.common.base.function.QuinFunction;

class FunctionalAction5<R, D1, D2, D3, D4, D5> extends AbstractAction5<R, D1, D2, D3, D4, D5> implements Action5<R, D1, D2, D3, D4, D5> {
  private final QuinFunction<D1, D2, D3, D4, D5, R> function;

  FunctionalAction5(QuinFunction<D1, D2, D3, D4, D5, R> function) {
    this.function = function;
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5) {
    return function.apply(data1, data2, data3, data4, data5);
  }
}
