package question_048;
//Каким будет результат компиляции и выполнения следующей программы?
//Short: 77
//Пояснение: "Short: " + (x + y) + (x + y) состоит из двух опреаторов +,
//которые левоассоциативны, то есть выражение эквивалентно (("Short: " + (x + y)) + (x + y)).
//Когда одним из аргументов + является строка, JVM выполняет конкатенацию строк. См. JLS 15.18.1
public class Test {
    public static void main(String[] args) { 
        byte a = 3; 
        short b = 4; 
        compute(a, b); 
    } 
 
    public static void compute(short x, short y) { 
        System.out.println("Short: " + (x + y) + (x + y)); 
    } 
} 