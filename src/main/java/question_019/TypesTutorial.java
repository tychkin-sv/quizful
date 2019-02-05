package question_019;
 
public class TypesTutorial { 
 
    public static void main(String... atgs) { 
        A alpha = new B(); 
    } 
} 
 /*
 Пояснение: Первым вызывается конструктор класса-родителя A, в нем вызывается переопределенный метод класса-потомка B,
  по типу созданного обьекта. Далее вызывается конструктор класса-потомка B, который вызывает тот же метод.
  */
class A { 
    A(){ 
        System.out.print("A"); 
        a(); 
    } 
     
    void a() { 
        System.out.print("a"); 
    } 
} 
 
class B extends A { 
    B() { 
        System.out.print("B"); 
        a(); 
    } 
     
    void a() { 
        System.out.print("b"); 
    } 
} 