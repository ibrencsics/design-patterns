package org.ib.designpatterns.gof.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.12.02.
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */

public class SortListAdapter implements Sorter
{

    @Override
    public Integer[] sort(int[] numbers)
    {
        //convert the array to a List
        List<Integer> numberList = new ArrayList<Integer>();

        //call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);

        //convert the list back to an array and return
        Integer[] sortedNumbers = numberList.toArray(new Integer[numberList.size()]);

        return sortedNumbers;
    }

}