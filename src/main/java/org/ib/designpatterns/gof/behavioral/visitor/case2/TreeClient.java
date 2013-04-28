package org.ib.designpatterns.gof.behavioral.visitor.case2;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.27.
 * Time: 10:25
 * To change this template use File | Settings | File Templates.
 */

/**
 * Source: Java Generics and Collections
 */

class TreeClient {

    public static <T> String toString(Tree<T> t) {
        return t.visit(new Tree.Visitor<T, String>() {
            public String leaf(T e) {
                return e.toString();
            }
            public String branch(String l, String r) {
                return "("+l+"^"+r+")";
            }
        });
    }

    public static <N extends Number> double sum(Tree<N> t) {
        return t.visit(new Tree.Visitor<N, Double>() {
            public Double leaf(N e) {
                return e.doubleValue();
            }
            public Double branch(Double l, Double r) {
                return l+r;
            }
        });
    }

    public static void main(String[] args) {
        Tree<Integer> t =
                Tree.branch(Tree.branch(Tree.leaf(1),
                        Tree.leaf(2)),
                        Tree.leaf(3));
        assert toString(t).equals("((1^2)^3)");
        System.out.println(toString(t));
        assert sum(t) == 6;
        System.out.println(sum(t));
    }
}

