package question_021;

/*
Что произойдет при компиляции и запуске данного кода?
Возникнет ошибка компиляции
Пояснение: Нельзя создавать экземпляры абстрактного класса используя оператор new, так как он не определен полностью
 */

abstract public class Parent {
    String s = "hello!"; 
    public void test() { 
        System.out.println(s); 
    } 
} 
 
class P { 
    public static void main(String[] args) { 
        //Parent p = new Parent();
        //p.test();
    } 
} 