package question_002;

public class Main {
 
    private static class A1 {  // !!! Приватный конструктор
        private String test() { 
            return "A1"; 
        } 
    } 
 
    public static class A2 extends A1 {

        public String test() { 
            return "A2"; 
        } 
    } 
 
    public static class A3 extends A2 { 
        public String test() { 
            return "A3"; 
        } 
    } 
 
    public static void main(String ... arg) { 
        A1 a1 = new A1(); 
        System.out.println(a1.test()); 
        a1 = new A2();
        System.out.println(a1.test());
        a1 = new A3();
        System.out.println(a1.test());
    } 
 
} 