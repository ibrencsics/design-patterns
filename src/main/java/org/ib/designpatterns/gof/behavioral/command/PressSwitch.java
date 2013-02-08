package org.ib.designpatterns.gof.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 22:26
 * To change this template use File | Settings | File Templates.
 */

/* The test class or client */
public class PressSwitch {
    public static void main(String[] args){

        String action = "OFF";

        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch s = new Switch();

        try {
            if (action.equalsIgnoreCase("ON")) {
                s.storeAndExecute(switchUp);
            }
            else if (action.equalsIgnoreCase("OFF")) {
                s.storeAndExecute(switchDown);
            }
            else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}