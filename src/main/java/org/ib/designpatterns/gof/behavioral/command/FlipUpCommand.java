package org.ib.designpatterns.gof.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */

/* The Command for turning on the light - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    public void execute(){
        theLight.turnOn();
    }
}