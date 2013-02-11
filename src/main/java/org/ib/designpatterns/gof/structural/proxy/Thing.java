package org.ib.designpatterns.gof.structural.proxy;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.10.
 * Time: 23:58
 * To change this template use File | Settings | File Templates.
 */

public abstract class Thing {

    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }

}