package org.ib.generics.comparable;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */

abstract class Fruit implements Comparable<Fruit> {

    protected String name;
    protected int size;

    protected Fruit(String name, int size) {
        this.name = name; this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Fruit) {
            Fruit that = (Fruit)o;
            return this.name.equals(that.name) && this.size == that.size;
        } else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*29 + size;
    }

    @Override
    public int compareTo(Fruit that) {
        return this.size < that.size ? - 1 :
                this.size == that.size ? 0 : 1 ;
    }
}
