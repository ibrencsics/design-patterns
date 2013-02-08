package org.ib.designpatterns.gof.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */

/* The Invoker class */
public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}