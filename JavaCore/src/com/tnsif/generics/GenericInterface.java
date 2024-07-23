package com.tnsif.generics;

import java.util.ArrayList;
import java.util.List;

// Define a generic interface ListInterface with methods to add, remove, and get elements.
interface ListInterface<T> {
    void add(T item);
    T get(int index);
    int size();
}

// Implement the ListInterface with a generic class SimpleList.
class SimpleList<T> implements ListInterface<T> {
    private List<T> items;

    public SimpleList() {
        items = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    @Override
    public int size() {
        return items.size();
    }
}

// Main class to test the SimpleList implementation.
public class GenericInterface {
    public static void main(String[] args) {
        // Create a SimpleList for Integer
        ListInterface<Integer> intList = new SimpleList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Integer List: " + intList.get(0) + ", " + intList.get(1) + ", " + intList.get(2));

        // Create a SimpleList for String
        ListInterface<String> strList = new SimpleList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("String List: " + strList.get(0) + ", " + strList.get(1));

        
    }
}



