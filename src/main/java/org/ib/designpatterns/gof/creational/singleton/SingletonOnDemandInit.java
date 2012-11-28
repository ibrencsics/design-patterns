package org.ib.designpatterns.gof.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.11.29.
 * Time: 0:03
 * To change this template use File | Settings | File Templates.
 */
public class SingletonOnDemandInit {

    // Private constructor prevents instantiation from other classes
    private SingletonOnDemandInit() { }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        public static final SingletonOnDemandInit INSTANCE = new SingletonOnDemandInit();
    }

    public static SingletonOnDemandInit getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
