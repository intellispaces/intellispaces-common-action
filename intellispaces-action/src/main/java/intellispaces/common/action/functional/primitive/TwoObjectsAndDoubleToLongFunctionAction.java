package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.function.primitive.TwoObjectsAndDoubleToLongFunction;

public class TwoObjectsAndDoubleToLongFunctionAction<D1, D2>
    extends AbstractAction3<Long, D1, D2, Double>
    implements Action3<Long, D1, D2, Double>
{
  private final TwoObjectsAndDoubleToLongFunction<D1, D2> function;

  public TwoObjectsAndDoubleToLongFunctionAction(TwoObjectsAndDoubleToLongFunction<D1, D2> function) {
    this.function = function;
  }

  @Override
  public Long execute(D1 data1, D2 data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public long executeReturnLong(D1 data1, D2 data2, double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public double executeReturnDouble(D1 data1, D2 data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
