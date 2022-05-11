package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{

    Node head ;
    Node tail;
    int size;
    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {

    }

    @Override
    public void enqueue(Object element)
    {
        Node node = new Node();

        if (head == null){
            head = node;
            node.data = element;
            tail = node.next;
            size++;
        } else {
            node.data = element;
            tail = node.next;
            size++;
        }

    }

    @Override
    public Object dequeue()
    {
        if (head == null){
            throw new NoSuchElementException("No elemets");
        } else{
            Node udeAfKo = head;
            head = head.next;
            size--;
            return udeAfKo;
        }

    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
       if (size == 0){
           return true;
       } else return false;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
