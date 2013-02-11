package org.ib.designpatterns.gof.structural.composite;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 1:04
 * To change this template use File | Settings | File Templates.
 */

public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(name + " leaf says hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println(name + " leaf says goodbye");
    }

}