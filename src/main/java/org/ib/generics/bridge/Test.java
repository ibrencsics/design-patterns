package org.ib.generics.bridge;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.03.27.
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("LegacyInteger:");

        for (Method m : LegacyInteger.class.getMethods())
            if (m.getName().equals("compareTo"))
                System.out.println(m.toGenericString());

        System.out.println("\n\nGenericInteger:");

        for (Method m : GenericInteger.class.getMethods())
            if (m.getName().equals("compareTo"))
                System.out.println(m.toGenericString());

        System.out.println("\n\nCovariant Overriding:");

        for (Method m : Point.class.getMethods())
            if (m.getName().equals("clone"))
                System.out.println(m.toGenericString());
    }
}
