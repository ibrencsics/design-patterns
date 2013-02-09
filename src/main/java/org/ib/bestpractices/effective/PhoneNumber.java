package org.ib.bestpractices.effective;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2013.02.09.
 * Time: 12:14
 * To change this template use File | Settings | File Templates.
 */

/**
 * Item 8 & 9 & 10 & 11 & 12
 * Override equals, hashcode, toString, clone, Comparable
 */

public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(short areaCode, short prefix, short lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    /*
    // Lazily initialized, cached hashCode
    private volatile int hashCode; // (See Item 71)
    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }
    */

    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    @Override
    public int compareTo(PhoneNumber pn) {
        // Compare area codes
        if (areaCode < pn.areaCode)
            return -1;
        if (areaCode > pn.areaCode)
            return 1;

        // Area codes are equal, compare prefixes
        if (prefix < pn.prefix)
            return -1;
        if (prefix > pn.prefix)
            return 1;

        // Area codes and prefixes are equal, compare line numbers
        if (lineNumber < pn.lineNumber)
            return -1;
        if (lineNumber > pn.lineNumber)
            return 1;
        return 0; // All fields are equal
    }

    /*
    // slightly better performance, but dangerous (assumes positive numbers, and no integer overflow after subtraction)
    public int compareTo(PhoneNumber pn) {
        // Compare area codes
        int areaCodeDiff = areaCode - pn.areaCode;
        if (areaCodeDiff != 0)
            return areaCodeDiff;
        // Area codes are equal, compare prefixes
        int prefixDiff = prefix - pn.prefix;
        if (prefixDiff != 0)
            return prefixDiff;
        // Area codes and prefixes are equal, compare line numbers
        return lineNumber - pn.lineNumber;
    }
    */
}
