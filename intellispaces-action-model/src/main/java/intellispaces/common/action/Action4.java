package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction4;

import java.util.function.Function;

/**
 * Case of the action with four processed data.
 *
 * @param <R> action return type.
 * @param <D1> first processed data type.
 * @param <D2> second processed data type.
 * @param <D3> third processed data type.
 * @param <D4> fourth processed data type.
 */
public interface Action4<R, D1, D2, D3, D4> extends Action5<R, D1, D2, D3, D4, Void> {

  /**
   * Executes action.
   */
  R execute(D1 data1, D2 data2, D3 data3, D4 data4);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, D4 data4);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, int data4);

  int executeReturnInt(D1 data1, D2 data2, D3 data3, double data4);

  int executeReturnInt(D1 data1, D2 data2, int data3, int data4);

  int executeReturnInt(D1 data1, D2 data2, int data3, double data4);

  int executeReturnInt(D1 data1, D2 data2, double data3, double data4);

  int executeReturnInt(D1 data1, int data2, int data3, int data4);

  int executeReturnInt(D1 data1, int data2, int data3, double data4);

  int executeReturnInt(D1 data1, int data2, double data3, double data4);

  int executeReturnInt(D1 data1, double data2, double data3, double data4);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, D4 data4);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, int data4);

  double executeReturnDouble(D1 data1, D2 data2, D3 data3, double data4);

  double executeReturnDouble(D1 data1, D2 data2, int data3, int data4);

  double executeReturnDouble(D1 data1, D2 data2, int data3, double data4);

  double executeReturnDouble(D1 data1, D2 data2, double data3, double data4);

  double executeReturnDouble(D1 data1, int data2, int data3, int data4);

  double executeReturnDouble(D1 data1, int data2, int data3, double data4);

  double executeReturnDouble(D1 data1, int data2, double data3, double data4);

  double executeReturnDouble(D1 data1, double data2, double data3, double data4);

  <W extends WrapperAction4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> W wrapAction4(
      Function<Action4<R, D1, D2, D3, D4>, W> wrapperFactory
  );
}
