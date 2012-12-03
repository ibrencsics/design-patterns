package org.ib.designpatterns.gof.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.12.02.
 * Time: 22:34
 * To change this template use File | Settings | File Templates.
 */

/*
 * This is our adaptee, a third party implementation of a
 * number sorter that deals with Lists, not arrays.
 */
public class NumberSorter
{
    public List<Integer> sort(List<Integer> numbers)
    {
        //sort and return
        return new ArrayList<Integer>();
    }

}