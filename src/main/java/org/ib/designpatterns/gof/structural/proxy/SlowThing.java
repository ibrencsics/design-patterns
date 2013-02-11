package org.ib.designpatterns.gof.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.10.
 * Time: 23:58
 * To change this template use File | Settings | File Templates.
 */

public class SlowThing extends Thing {

    public SlowThing() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}