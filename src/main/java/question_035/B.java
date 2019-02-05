package question_035;
//Что произойдет в результате компиляции и выполнения следующего кода?
//Ошибка во время выполнения
//Пояснение: Будет сгенерировано исключение ClassCastException.
class A {
    int i = 0; 
    public int increment() { 
        return ++i; 
    } 
} 
 
public class B extends A { 
    int i = 1;                                        // 1 
    public int increment() { 
        return ++i; 
    } 
     
    public static void main(String[] args) { 
        B b = (B) new A();                            // 2 
        System.out.println(b.increment()); 
    } 
} 