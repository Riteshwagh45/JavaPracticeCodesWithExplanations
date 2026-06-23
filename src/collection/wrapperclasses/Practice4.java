package collection.wrapperclasses;

public class Practice4 {

    public static void main(String[] args) {

        Integer a = new Integer(100);

        Integer b = new Integer(100);

        Integer c = Integer.valueOf(100);

        Integer d = Integer.valueOf(100);

        System.out.println(a == b);

        System.out.println(c == d);

        System.out.println(a.equals(b));

    }
}
/*
Explanation

a and b

new creates two different objects.
Different references.
== returns false.

c and d

valueOf() uses Integer Cache.
Same object.
== returns true.

.equals()

Compares values.
Returns true.
Output
false
true
true
Concept

✅ new → Always New Object

✅ valueOf() → Uses Integer Cache
 */