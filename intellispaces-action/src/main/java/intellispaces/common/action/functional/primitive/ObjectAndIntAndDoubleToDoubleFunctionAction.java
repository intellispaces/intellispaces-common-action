package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction3;
import intellispaces.common.action.Action3;
import intellispaces.common.base.exception.UnexpectedExceptions;
import intellispaces.common.base.function.primitive.ObjectAndIntAndDoubleToDoubleFunction;

public class ObjectAndIntAndDoubleToDoubleFunctionAction<D>
    extends AbstractAction3<Double, D, Integer, Double>
    implements Action3<Double, D, Integer, Double>
{
  private final ObjectAndIntAndDoubleToDoubleFunction<D> function;

  public ObjectAndIntAndDoubleToDoubleFunctionAction(ObjectAndIntAndDoubleToDoubleFunction<D> function) {
    this.function = function;
  }

  @Override
  public Double execute(D data1, Integer data2, Double data3) {
    return function.apply(data1, data2, data3);
  }

  @Override
  public int executeReturnInt(D data1, int data2, double data3) {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble(D data1, int data2, double data3) {
    return function.apply(data1, data2, data3);
  }
}
