package collection.wrapperclasses;

public class Practice7 {

    public static void main(String[] args) {

        Integer a = null;

        int x = a;

        System.out.println(x);

    }
}
/*
Explanation

Compiler performs

int x = a.intValue();

Since

a = null

Java can't call intValue().

Throws

NullPointerException
Output
Exception in thread "main"

java.lang.NullPointerException
Concept

Never unbox a null wrapper object.
 */