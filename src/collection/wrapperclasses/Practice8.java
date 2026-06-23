package collection.wrapperclasses;

public class Practice8 {

    public static void main(String[] args) {

        int x = 15;

        Integer a = x;

        Integer b = Integer.valueOf(x);

        Integer c = new Integer(x);

        int y = a;

        System.out.println(a == b);

        System.out.println(a == c);

        System.out.println(a.equals(c));

        System.out.println(y);

    }
}
/*
Explanation

a

Autoboxing

b

Uses Integer Cache

c

Creates new object

y

Auto-Unboxing

a == b

Same object

true

a == c

Different objects

false

a.equals(c)

Same values

true
Output
true
false
true
15
 */
