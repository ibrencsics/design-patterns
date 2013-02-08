package org.ib.designpatterns.gof.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */

/* The Receiver class */
public class Light {
    public Light() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}