package org.ib.generics.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */

class GenericInteger implements Comparable<GenericInteger> {

    private final int value;

    public GenericInteger(int value) { this.value = value; }

    public int compareTo(GenericInteger i) {
        return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
    }
}
