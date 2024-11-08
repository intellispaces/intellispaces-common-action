package intellispaces.common.action;

import intellispaces.common.action.wrapper.WrapperAction;
import intellispaces.common.base.exception.UnexpectedExceptions;

import java.util.function.Function;

/**
 * Abstract general action.
 */
public abstract class AbstractAction implements Action {

  @Override
  public Object execute() {
    return execute(null);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action1");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action2");
  }

  @Override
  public <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action3");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action5");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5, $D6> Action6<$R, $D1, $D2, $D3, $D4, $D5, $D6> asAction6() {
    throw UnexpectedExceptions.withMessage("Attempt to cast incompatible types of actions. " +
        "General action can not be casted to Action6");
  }

  @Override
  public <W extends WrapperAction> W wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }
}
