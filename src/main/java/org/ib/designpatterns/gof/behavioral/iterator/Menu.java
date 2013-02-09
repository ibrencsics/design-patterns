package org.ib.designpatterns.gof.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.09.
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */

public class Menu {

    List<Item> menuItems;

    public Menu() {
        menuItems = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        menuItems.add(item);
    }

    public Iterator<Item> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Item> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= menuItems.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Item next() {
            return menuItems.get(currentIndex++);
        }

        @Override
        public void remove() {
            menuItems.remove(--currentIndex);
        }

    }

}