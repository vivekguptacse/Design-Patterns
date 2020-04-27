package iterator;

/**
 * Interface Iterator whose main there responsibility to provide method for iterating underlying type
 * of data structure used by the concrete implementation of this class.
 * @param <T>
 */
public interface Iterator<T>
{
    /**
     * is next element present
     * @return
     */
    boolean hasNext();

    /**
     * return the current element
     * @return
     */
    T current();

    /**
     * Move the pointer to next
     */
    void next();
}
