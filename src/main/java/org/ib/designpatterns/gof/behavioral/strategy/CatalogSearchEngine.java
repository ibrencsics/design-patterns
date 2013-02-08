package org.ib.designpatterns.gof.behavioral.strategy;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.08.
 * Time: 21:54
 * To change this template use File | Settings | File Templates.
 */
public class CatalogSearchEngine {

    private SortStrategy sorter;

    public CatalogSearchEngine(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public ArrayList search() {
        ArrayList list = null; // perform search
        sorter.sort(list);
        return list;
    }
}
