package stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
ArrayList<Object> list = new ArrayList();

    @Override
    public void push(Object element) {
        list.add(element);
    }

    @Override
    public Object pop() {
        if (list.size() == 0)
        {
            throw new NoSuchElementException("Intet element");
        }

        Object slettet = list.remove(list.size()-1);
        return slettet;
    }

    @Override
    public Object peek() {
        if (list.isEmpty())
        {
            throw new NoSuchElementException("Intet element");
        }
        return list.get(list.size()-1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if (list.size() == 0)
            return true;
        else return false;
    }
}
