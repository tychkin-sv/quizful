package question_013;

public class Test {
    static String s; 
     
    static void go() { 
        System.out.println(s); 
        go(); 
    } 
 //Пояснение: При бесконечной рекурсии рано или поздно стек вызова методов переполнится и
 // будет сгенерировано соответствующее исключение.
    public static void main(String[] args) { 
        go(); 
    } 
} 