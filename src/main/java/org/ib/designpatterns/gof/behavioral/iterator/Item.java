package org.ib.designpatterns.gof.behavioral.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.09.
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public class Item {

    String name;
    float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + ": $" + price;
    }
}