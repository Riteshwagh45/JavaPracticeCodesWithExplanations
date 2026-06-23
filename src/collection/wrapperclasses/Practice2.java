package collection.wrapperclasses;

public class Practice2 {
    public static void main(String[] args) {

        Integer a = 10;

        Integer b = Integer.valueOf(10);

        Integer c = new Integer(10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

/*

 a

Uses Autoboxing.
Compiler converts it into Integer.valueOf(10).

b

Uses Integer.valueOf().
Uses Integer Cache.

c

Uses new.
Always creates a new object.
Doesn't use Integer Cache.
Deprecated.

Output
10
10
10

Concept

✅ Integer.valueOf() → Recommended

✅ new Integer() → Deprecated

 */