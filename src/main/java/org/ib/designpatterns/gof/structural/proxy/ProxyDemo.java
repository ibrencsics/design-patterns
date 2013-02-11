package org.ib.designpatterns.gof.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.10.
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */

public class ProxyDemo {

    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        FastThing fastThing = new FastThing();
        fastThing.sayHello();

        proxy.sayHello();

    }

}