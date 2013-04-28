package org.ib.designpatterns.gof.behavioral.visitor.case1;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.27.
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */

/**
 * Source: http://en.wikipedia.org/wiki/Visitor_pattern
 */

public class VisitorDemo {

    static public void main(String[] args) {
        CarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
