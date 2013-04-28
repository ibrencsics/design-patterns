package org.ib.bestpractices.effective.composition;

import java.util.Collection;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.11.
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */

// Wrapper class - uses composition in place of inheritance
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;
    public InstrumentedSet(Set<E> s) {
        super(s);
    }
    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
}