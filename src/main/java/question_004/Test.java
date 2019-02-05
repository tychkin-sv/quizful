package question_004;

public class Test {
    public static void main(String... args) { 
        test("A", "B"); 
    } 
 
    public static void test(String... str) { 
        System.out.print("A"); 
    } 

    // Приоритет
    public static void test(String str1, String str2) { 
        System.out.print("B"); 
    } 
 
    public static void test(String str1, String... str2) { 
        System.out.print("C"); 
    } 
} 