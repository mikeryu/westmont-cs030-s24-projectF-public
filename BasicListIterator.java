/**
 * Westmont College Spring 2025
 * CS 030 Project F
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Specification for an extended Iterator functionality for backwards traversal.
 */
public interface BasicListIterator extends Iterator<Object> {

  /**
   * Returns {@code true} if the iteration has a previous element.
   * (In other words, returns {@code true} if {@link #previous} would
   * return an element rather than throwing an exception.)
   * <br><br>
   * <b>NOTE</b> This method does not change the state of the iterator.
   * Calling this method on a new {@link BasicListIterator} instance before
   * any calls toe {@link Iterator#next} will always return {@code false}.
   *
   * @return {@code true} if the iteration has a previous element
   */
  boolean hasPrevious();

  /**
   * Returns the previous element in the iteration.
   *
   * @return the previous element in the iteration
   * @throws NoSuchElementException if the iteration has no previous elements
   */
  Object previous();
}