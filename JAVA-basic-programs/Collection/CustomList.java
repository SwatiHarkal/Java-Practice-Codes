package Collection;

import java.util.Arrays;

public class CustomList<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size = 0;

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
           // throw new IndexOutOfBoundsException("Size" + size);
            ensureCapacity();
        }
        elements[size] = e;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (E) elements[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + size);
        }

        Object removedElement = elements[index];
        for (int i = index+1; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return removedElement;
    }

    private void ensureCapacity(){
        int new_Capacity = elements.length*2;
        elements = Arrays.copyOf(elements, new_Capacity);
    }

    public void displayAll(){
        for(int i = 0; i< size; i++){
            System.out.println("Array List: " +elements[i]);
        }
    }

    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.displayAll();
        System.out.println("element at index 1: " + list.get(1));
        System.out.println("removed element from index 2: " + list.remove(2));
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.displayAll();
        System.out.println("new Array Size: " + list.size);

    }

}
