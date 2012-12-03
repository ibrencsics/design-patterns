package org.ib.designpatterns.gof.structural.facade;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.12.03.
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */

// Client

public class Main {
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.startComputer();
    }
}
