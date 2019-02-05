package question_028;

public class TestClass {
    public static void main(String[] args) { 
        Base sub = new Sub(); 
        sub.test(); 
    } 
} 
 
class Base { 
    public static void test() { 
        System.out.println("Base.test()"); 
    } 
} 
 
class Sub extends Base { 
    public static void test() { 
        System.out.println("Sub.test()"); 
    } 
} 