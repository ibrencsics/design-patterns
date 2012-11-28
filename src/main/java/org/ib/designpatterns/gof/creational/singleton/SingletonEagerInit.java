package org.ib.designpatterns.gof.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.11.28.
 * Time: 23:57
 * To change this template use File | Settings | File Templates.
 */
public class SingletonEagerInit {

    private static final SingletonEagerInit instance = new SingletonEagerInit();

    private SingletonEagerInit() {}

    public static SingletonEagerInit getInstance() {
        return instance;
    }
}
