package org.ib.designpatterns.gof.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 23:15
 * To change this template use File | Settings | File Templates.
 */

// The Coffee Interface defines the functionality of Coffee implemented by decorator
public interface Coffee {
    public double getCost(); // returns the cost of the coffee
    public String getIngredients(); // returns the ingredients of the coffee
}