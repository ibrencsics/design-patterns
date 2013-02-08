package org.ib.designpatterns.gof.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 22:25
 * To change this template use File | Settings | File Templates.
 */

/* The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}