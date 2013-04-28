package org.ib.designpatterns.gof.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */

// implementation of a simple coffee without any extra ingredients
public class SimpleCoffee implements Coffee {
    public double getCost() {
        return 1;
    }

    public String getIngredients() {
        return "Coffee";
    }
}