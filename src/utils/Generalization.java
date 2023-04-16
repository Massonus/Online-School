package utils;

import java.io.IOException;

public class Generalization<E> {
    E[] lecturesArray;

    public int size() throws IOException {

        try {
            final int length = lecturesArray.length;
            System.out.println(length);
            return length;
        } catch (NullPointerException e) {
            throw new IOException(e);
        }

    }

    public boolean isEmpty() {
        if (lecturesArray == null) {
            System.out.println("Empty");
            return true;
        }
        return false;
    }

    public E[] get(int index) {
        for (E e : lecturesArray) {
            System.out.println(lecturesArray[index]);
            index++;
        }
        return lecturesArray;

    }

    public E[] add(E[] value) {
        try {
            lecturesArray = value;
            return lecturesArray;
        } catch (NullPointerException e) {
            throw new ArithmeticException();
        }


    }

    public void add(int index, E e) {
        if (lecturesArray == null) {
            System.out.println("Empty");
            return;
        }
        lecturesArray[index] = e;
    }

    public boolean remove(int index) {
        if (index < lecturesArray.length) {
            lecturesArray[index] = null;
            return true;
        }
        return false;
    }

}
