package intellispaces.common.action.getter;

import java.util.function.Supplier;

class SupplierBasedGetter<R> extends AbstractGetter<R> implements Getter<R> {
  private final Supplier<R> supplier;

  SupplierBasedGetter(Supplier<R> supplier) {
    this.supplier = supplier;
  }

  @Override
  public R get() {
    return supplier.get();
  }

  @Override
  public int getAsInt() {
    return (Integer) supplier.get();
  }

  @Override
  public double getAsDouble() {
    return (Double) supplier.get();
  }
}
