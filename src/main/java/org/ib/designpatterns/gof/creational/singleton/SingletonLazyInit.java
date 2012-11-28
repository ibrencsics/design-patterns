package org.ib.designpatterns.gof.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.11.28.
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class SingletonLazyInit {

    private static volatile SingletonLazyInit instance = null;

    private SingletonLazyInit() {
    }

    public static SingletonLazyInit getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyInit.class) {
                if (instance == null) {
                    instance = new SingletonLazyInit();
                }
            }
        }
        return instance;
    }
}
