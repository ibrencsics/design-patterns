package org.ib.designpatterns.gof.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.11.29.
 * Time: 23:50
 * To change this template use File | Settings | File Templates.
 */

public class ResponseHandler implements Observer {
    private String resp;
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp );
        }
    }
}