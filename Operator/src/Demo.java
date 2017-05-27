public class Demo {
static String str = "hi";

public static void main(String arg[]) {

Demo obj1 = new Demo();
Demo obj2 = new Demo();

System.out.println(Demo.str);
System.out.println(System.identityHashCode(obj1));
System.out.println(obj1.str);
System.out.println(obj2.str);
System.out.println("obj1:" + obj1.str.hashCode());
System.out.println("obj2:" + obj2.str.hashCode());
System.out.println("Demo:" + Demo.str.hashCode());
str = "hi set by obj1";

System.out.println(Demo.str);//
System.out.println(obj1.str);
System.out.println(obj2.str);
System.out.println("obj1:" + obj1.str.hashCode());
System.out.println("obj2:" + obj2.str.hashCode());
System.out.println("Demo:" + Demo.str.hashCode());
System.out.println(str);

str = "hi";

System.out.println(Demo.str);//
System.out.println(obj1.str);
System.out.println(obj2.str);
System.out.println("obj1:" + obj1.str.hashCode());
System.out.println("obj2:" + obj2.str.hashCode());
System.out.println("Demo:" + Demo.str.hashCode());
System.out.println(str);
}

}