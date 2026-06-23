package collection.wrapperclasses;

public class Practice6 {

    public static void main(String[] args) {

        Integer a = 20;

        Integer b = 40;

        System.out.println(Integer.max(a, b));

        System.out.println(Integer.min(a, b));

        System.out.println(Integer.sum(a, b));

        System.out.println(Integer.compare(a, b));

    }
}
/*
Explanation

max()

Returns larger value.

min()

Returns smaller value.

sum()

Returns addition.

compare()

Returns

-1

because

20 < 40

Output
40
20
60
-1
 */