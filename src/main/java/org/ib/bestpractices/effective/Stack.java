package org.ib.bestpractices.effective;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.09.
 * Time: 13:13
 * To change this template use File | Settings | File Templates.
 */

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Item 11
 * Clone
 */

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    // Ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
