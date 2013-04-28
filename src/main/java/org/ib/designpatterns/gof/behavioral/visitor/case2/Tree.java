package org.ib.designpatterns.gof.behavioral.visitor.case2;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.27.
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */

abstract class Tree<E> {

    public interface Visitor<E, R> {
        public R leaf(E elt);
        public R branch(R left, R right);
    }

    public abstract <R> R visit(Visitor<E, R> v);

    public static <T> Tree<T> leaf(final T e) {
        return new Tree<T>() {
            public <R> R visit(Visitor<T, R> v) {
                return v.leaf(e);
            }
        };
    }

    public static <T> Tree<T> branch(final Tree<T> l, final Tree<T> r) {
        return new Tree<T>() {
            public <R> R visit(Visitor<T, R> v) {
                return v.branch(l.visit(v), r.visit(v));
            }
        };
    }
}