package intellispaces.common.action.functional;

import intellispaces.common.action.Action0;
import intellispaces.common.base.type.SimpleTypes;
import intellispaces.common.base.type.Type;

import java.util.function.Supplier;

public interface SupplierActions {

  static <R> Action0<R> of(Supplier<R> supplier) {
    return ofSupplier(supplier, null);
  }

  static <R> Action0<R> of(Supplier<R> supplier, Class<R> resultClass) {
    return ofSupplier(supplier, SimpleTypes.of(resultClass));
  }

  static <R> Action0<R> ofSupplier(Supplier<R> supplier, Type<R> resultType) {
    return new FunctionalAction0<>(supplier);
  }
}