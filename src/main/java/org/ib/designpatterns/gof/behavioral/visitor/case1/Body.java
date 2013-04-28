package org.ib.designpatterns.gof.behavioral.visitor.case1;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.27.
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class Body implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
