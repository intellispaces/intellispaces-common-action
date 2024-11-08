package intellispaces.common.action.functional.primitive;

import intellispaces.common.action.AbstractAction0;
import intellispaces.common.action.Action0;
import intellispaces.common.base.exception.UnexpectedExceptions;

import java.util.function.DoubleSupplier;

public class DoubleSupplierAction extends AbstractAction0<Double> implements Action0<Double> {
  private final DoubleSupplier supplier;

  public DoubleSupplierAction(DoubleSupplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Double execute() {
    return supplier.getAsDouble();
  }

  @Override
  public int executeReturnInt() {
    throw UnexpectedExceptions.withMessage("Unsupported operation");
  }

  @Override
  public double executeReturnDouble() {
    return supplier.getAsDouble();
  }
}
