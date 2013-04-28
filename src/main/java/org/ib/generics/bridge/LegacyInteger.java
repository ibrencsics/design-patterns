package org.ib.generics.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */

class LegacyInteger implements Comparable {

    private final int value;

    public LegacyInteger(int value) { this.value = value; }

    public int compareTo(Object o) {
        return compareTo((LegacyInteger)o);
    }

    public int compareTo(LegacyInteger i) {
        return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
    }
}
