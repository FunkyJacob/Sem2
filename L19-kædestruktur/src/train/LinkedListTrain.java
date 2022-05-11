package train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    { if (firstWagon == null){
        firstWagon = wagon;
    } else wagon.setNextWagon(firstWagon);
        firstWagon = wagon;

    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        if (firstWagon == null) {
            throw new NoSuchElementException("Train has no wagon nodes");
        } else {
            WagonNode removed = firstWagon;
            firstWagon = firstWagon.getNextWagon();

            return removed;
        }
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count() {
        int count = 0;
        WagonNode current = firstWagon;
        while (current != null) {
            count += 1;
            current = current.getNextWagon();
        }
        return count;
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        boolean removed = false;
        WagonNode temp = firstWagon;
        while (temp.getNextWagon()!= null){
            if (temp.getNextWagon().equals(wagon)){
                temp.setNextWagon(wagon.getNextWagon());
                removed = true;
            }
            temp = temp.getNextWagon();
        }

        return removed;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        int sum = count();
        WagonNode temp = firstWagon;
        while (sum>0){
            temp = temp.getNextWagon();
            if (sum == position-1){
                wagon.setNextWagon(temp.getNextWagon());
                temp.setNextWagon(wagon);
            }
            sum--;
        }
    }
}
