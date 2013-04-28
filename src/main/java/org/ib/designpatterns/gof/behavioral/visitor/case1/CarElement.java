package org.ib.designpatterns.gof.behavioral.visitor.case1;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.27.
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public interface CarElement {
    void accept(CarElementVisitor visitor);
}
