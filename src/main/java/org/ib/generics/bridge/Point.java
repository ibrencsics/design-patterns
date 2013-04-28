package org.ib.generics.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */

class Point {
    public int x;
    public int y;
    public Point(int x, int y) { this.x=x; this.y=y; }
    public Point clone() { return new Point(x,y); }
}
