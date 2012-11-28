package org.ib.designpatterns.gof.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.11.29.
 * Time: 0:00
 * To change this template use File | Settings | File Templates.
 */
public class SingletonStaticBlockInit {

    private static final SingletonStaticBlockInit instance;

    static {
        try {
            instance = new SingletonStaticBlockInit();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }

    public static SingletonStaticBlockInit getInstance() {
        return instance;
    }

    private SingletonStaticBlockInit() {
        // ...
    }
}
