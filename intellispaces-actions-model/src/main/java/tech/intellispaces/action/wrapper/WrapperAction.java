package tech.intellispaces.action.wrapper;

import tech.intellispaces.action.Action;

/**
 * The wrapper action.<p/>
 *
 * The wrapper action wraps another action.
 *
 */
public interface WrapperAction extends Action {

  /**
   * The wrapped action.
   */
  Action wrappedAction();
}