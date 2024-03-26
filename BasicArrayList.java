/**
 * Westmont College Spring 2024
 * CS 030 Project F
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

/**
 * TODO: Write a clear and concise single-sentence summary to describe this ADT.
 */
public class BasicArrayList implements BasicList {

  /**
   * Default initial capacity (size) of the underlying array that is used to implement this list.
   */
  public static final int DEFAULT_CAPACITY = 10;

  // METHOD: capacity
  // returns the current capacity of the list which is equal to
  // the current length of the private array

  /**
   * Returns the current capacity of the list, which is equal to the
   * current length of the underlying private array that is in use.
   *
   * @return length of the {@code private} array in use to implement this list
   */
  public int capacity() {
    // TODO: Your implementation here.
  }

  /**
   * Frees up any unused space in the list by reducing the capacity of the underlying array to the size of the list.
   */
  public void trimToSize() {
    // TODO: "Shrink" the size of the private array so no space is wasted.
  }

  /**
   * Returns the reference to your private array so that the instructor's test driver can verify
   * that you are doing things correctly. Normally, you would not provide such access to code outside
   * your class, but in this case, it is the only way I can be sure you code is behaving correctly.
   *
   * @return reference to the {@code private} array in use to implement this list
   */
  public Object[] unusualMethodForTestDriverOnly() {
    // TODO: simply return the reference to your private array here.
  }
}