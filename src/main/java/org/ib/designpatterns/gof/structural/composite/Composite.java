package org.ib.designpatterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 1:05
 * To change this template use File | Settings | File Templates.
 */

public class Composite implements Component {

    List<Component> components = new ArrayList<Component>();

    @Override
    public void sayHello() {
        for (Component component : components) {
            component.sayHello();
        }
    }

    @Override
    public void sayGoodbye() {
        for (Component component : components) {
            component.sayGoodbye();
        }
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int index) {
        return components.get(index);
    }

}