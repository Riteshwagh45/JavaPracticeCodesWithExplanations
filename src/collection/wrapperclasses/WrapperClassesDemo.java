package collection.wrapperclasses;

public class WrapperClassesDemo {
    public static void main(String[] args){
        //int x = 10;
        //System.out.println(x);

        //depricated this method in java 9
       // Integer obj = new Integer(x);
       // System.out.println(obj);

        //this is AutoBoxing compiler do by self in the automatically fast and best
       // Integer i1 = x;
       // System.out.println(i1);

        //this is explicit autoboxing using valueof()
       // Integer i2 = Integer.valueOf(x);
       // System.out.println(i2);

        Integer a = new Integer(100);
        Integer b = new Integer(100);

        if(a.equals(b)){
            System.out.println("true");
        }

        else{
            System.out.println("false");
        }

    }
}
