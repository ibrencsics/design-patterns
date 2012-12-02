package org.ib.designpatterns.gof.structural.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.12.02.
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args) {
        int[] numbers = new int[]{34, 2, 4, 12, 1};

        Sorter sorter = new SortListAdapter();
        sorter.sort(numbers);
    }
}
