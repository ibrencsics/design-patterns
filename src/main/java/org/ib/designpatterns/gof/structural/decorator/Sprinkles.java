package org.ib.designpatterns.gof.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 23:17
 * To change this template use File | Settings | File Templates.
 */

// Decorator Sprinkles that mixes sprinkles with coffee
// note it extends CoffeeDecorator
class Sprinkles extends CoffeeDecorator {
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
}