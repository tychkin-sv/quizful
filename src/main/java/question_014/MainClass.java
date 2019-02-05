package question_014;

class A {
    public void m(int k) { 
        System.out.println("class A, method m : " + ++k); 
    } 
} 
 
class B extends A { 
    public void/*int*/ m(int k) {
        System.out.println("class B, method m : " + k++); 
       // return k;
    } 
} 
 /*
 Пояснение: Пояснение: в методах void m(int k) класса A и int m(int k) класса B
 не совпадают типы возвращаемых значений, что и вызывает ошибку компилятора.
  */
public class MainClass { 
    public static void main(String args[]) { 
        A a = new B(); 
        a.m(34); 
    } 
} 