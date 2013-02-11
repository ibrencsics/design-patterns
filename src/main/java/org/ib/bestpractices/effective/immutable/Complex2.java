package org.ib.bestpractices.effective.immutable;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.10.
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */

/**
 * Item 15
 * Example immutable class
 */

// Immutable class with static factories instead of constructors
public class Complex2 {

    private final double re;
    private final double im;

    private Complex2(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public static Complex2 valueOf(double re, double im) {
        return new Complex2(re, im);
    }
    // Remainder unchanged
}