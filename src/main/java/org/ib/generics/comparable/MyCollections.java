package org.ib.generics.comparable;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class MyCollections {

    public static <T extends Comparable<T>> T max_restricted(Collection<T> coll) {
        Iterator<T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T elt = it.next();
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T elt = it.next();
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }
}
