package collection.wrapperclasses;

public class Practice5 {

    public static void main(String[] args) {

        String s = "250";

        int x = Integer.parseInt(s);

        Integer y = Integer.valueOf(s);

        System.out.println(x);

        System.out.println(y);

    }
}
/*
Explanation

parseInt()

Converts String → Primitive int.

valueOf()

Converts String → Integer Object.

If String is "abc"

Both methods throw

NumberFormatException
Output
250
250
Concept

✅ parseInt() → Returns Primitive

✅ valueOf() → Returns Wrapper Object
 */
