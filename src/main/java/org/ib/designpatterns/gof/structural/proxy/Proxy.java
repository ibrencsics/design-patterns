package org.ib.designpatterns.gof.structural.proxy;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.10.
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */

public class Proxy {

    SlowThing slowThing;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        slowThing.sayHello();
    }

}