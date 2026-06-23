package collection.wrapperclasses;

public class practice1 {
    public static void main(String[] args) {

        int x = 50;

        Integer obj = x;

        int y = obj;

        System.out.println(x);
        System.out.println(obj);
        System.out.println(y);
    }
}

/*
Explanation:

x is a primitive variable storing 50.
Integer obj = x; performs Autoboxing.
Compiler converts it to:

Integer obj = Integer.valueOf(x);

obj stores the reference of an Integer object.
int y = obj; performs Auto-Unboxing.
Compiler converts it to:

int y = obj.intValue();

Output
50
50
50

Concept

✅ Primitive → Wrapper = Autoboxing

✅ Wrapper → Primitive = Unboxing

*/