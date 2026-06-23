package collection.wrapperclasses;

public class Practice3 {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);

        System.out.println(c == d);

        System.out.println(a.equals(b));

        System.out.println(c.equals(d));
    }
}

/*
100

Inside Integer Cache (-128 to 127).
Both variables point to the same object.
== returns true.

200

Outside Integer Cache.
Different objects are created.
== returns false.

.equals()

Compares actual values.
Doesn't compare references.
Output
true
false
true
true
Concept

✅ == → Compare References

✅ .equals() → Compare Values
 */
