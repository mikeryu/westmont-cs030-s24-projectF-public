/**
 * Westmont College Spring 2025
 * CS 030 Project F
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

/**
 * Specification for an ordered collection that has a basic set of list-like behaviors.
 */
public interface BasicList {
  /**
   * Returns the logical size of the list, which is the number of elements
   * that have been added to the list but not been removed yet.
   *
   * @return logical size of the list
   */
  int size();

  /**
   * Adds (inserts) the specified <code>element</code> at the given <code>index</code>
   * of the list, shifting existing elements at and after the <code>index</code> if the
   * given index is already occupied by another element.
   *
   * @param index   location at which to add (insert) the specified <code>element</code>
   * @param element {@link Object} to add to the list at the given <code>index</code>
   * @throws IndexOutOfBoundsException if index is negative or greater than logical size of the list
   */
  void add(int index, Object element);

  /**
   * Adds the specified element to the logical end of the list.
   *
   * @param element {@link Object} to add at the end of the list
   */
  void add(Object element);

  /**
   * Clears the list of its contents.
   * <br><br>
   * <b>NOTE</b> after invoking this method, the list should be in the
   * same state as the state immediately following its construction
   * with a default constructor.
   */
  void clear();

  /**
   * Using the provided <code>element</code>'s {@link Object#equals(Object)} method,
   * determines whether the list contains the specified <code>element</code> or not.
   *
   * @param element {@link Object} to check the membership within the list
   * @return <code>true</code> if <code>element</code> is in the list, <code>false</code> otherwise
   */
  boolean contains(Object element);

  /**
   * Returns a reference ot the element at the specified index.
   *
   * @param index location in the list to fetch the {@link Object} reference from
   * @return reference to the {@link Object} at the specified <code>index</code>
   * @throws IndexOutOfBoundsException if <code>index</code> is negative or greater or equal to the logical size of the list
   */
  Object get(int index);

  /**
   * Using the provided <code>element</code>'s {@link Object#equals(Object)} method, returns
   * the index of the first occurrence in the list that is equal to the provided element.
   *
   * @param element {@link Object} to retrieve the index of the matching occurrence in the list
   * @return index of the occurrence in the list that matches the provided <code>element</code>, if one exists
   * @throws java.util.NoSuchElementException if no matching occurrence to the <code>element</code> is in the list
   */
  int indexOf(Object element);

  /**
   * Removes and returns an element at the specified <code>index</code>.
   *
   * @param index index of the element to remove and return
   * @return reference to the element that was removed
   * @throws IndexOutOfBoundsException if <code>index</code> is negative or greater or equal to the logical size of the list
   */
  Object remove(int index);

  /**
   * Sets (replaces) the element at the specified index, returning the replaced {@link Object}.
   *
   * @param index   location in the list to replace the existing element with the given <code>element</code>
   * @param element {@link Object} to place at the specified <code>index</code>
   * @return reference to the {@link Object} that was just replaced
   * @throws IndexOutOfBoundsException if <code>index</code> is negative or greater or equal to the logical size of the list
   */
  Object set(int index, Object element);
}