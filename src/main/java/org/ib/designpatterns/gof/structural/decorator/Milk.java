package org.ib.designpatterns.gof.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 23:16
 * To change this template use File | Settings | File Templates.
 */

// Decorator Milk that mixes milk with coffee
// note it extends CoffeeDecorator
class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() { // overriding methods defined in the abstract superclass
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}