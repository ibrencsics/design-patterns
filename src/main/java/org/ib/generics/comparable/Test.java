package org.ib.generics.comparable;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {

        Apple a1 = new Apple(1);  Apple a2 = new Apple(2);
        Orange o3 = new Orange(3);  Orange o4 = new Orange(4);

        List<Apple> apples = Arrays.asList(a1, a2);
        assert MyCollections.max(apples).equals(a2);

        List<Orange> oranges = Arrays.asList(o3,o4);
        assert MyCollections.max(oranges).equals(o4);

        List<Fruit> mixed = Arrays.<Fruit>asList(a1,o3);
        assert MyCollections.max(mixed).equals(o3);  // ok
        assert MyCollections.max_restricted(mixed).equals(o3);  // ok
    }

}
