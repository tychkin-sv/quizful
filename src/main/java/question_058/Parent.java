package question_058;
//Что произойдет в результате компиляции и выполнения кода:
//Ошибка компиляции в строке 1
//Ошибка компиляции в строке 2
//Пояснение: В данном случае ключевое слово final используется для отмены наследования класса parent и отказа от переопределения метода test()
final public class Parent {
    final public void test() {             
        System.out.println("hello"); 
    } 
} 
 /*
class Child extends Parent {         //1 
    public void test() {             //2 
        System.out.println("world"); 
    }     
} 
 
class Main {             
    public static void main(String args[]) { 
        Child c = new Child(); 
        c.test(); 
    }
} */