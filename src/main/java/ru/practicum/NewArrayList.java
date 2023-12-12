package ru.practicum;

import java.util.Arrays;
import java.util.Collection;

public class NewArrayList<E extends Comparable<E>> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private int capacity;
    private Object[] arrayList;

    public NewArrayList() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.arrayList = new Object[DEFAULT_CAPACITY];

    }

    public boolean add(E value) {
        if (capacity - 1 == size) {
            capacity += 10;
            arrayList = Arrays.copyOf(arrayList, capacity);
        }

        arrayList[size++] = value;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return (E) arrayList[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }

        arrayList[size - 1] = null;
        size--;
    }

    public boolean addAll(Collection<? extends E> collections) {
        for (E value : collections) {
            add(value);
        }
        return true;
    }

    public void sortBubble() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((E) arrayList[j]).compareTo((E) arrayList[j + 1]) > 0) {
                    Object temp = arrayList[j];

                    arrayList[j] = arrayList[j + 1];
                    arrayList[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < size; s++) {
            sb.append(arrayList[s].toString()).append("\n");
        }
        return sb.toString();
    }
}
