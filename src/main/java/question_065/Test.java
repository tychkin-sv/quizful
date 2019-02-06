package question_065;
//Каким будет результат работы следующей программы?
//B Main A Test
//Пояснение: Инициализация полей происходит до вызова конструктора, а статических полей - при загрузке класса в память

class A {
  public A() { System.out.print("A "); } 
} 
 
class B { 
  public B() { System.out.print("B "); } 
} 
 
public class Test { 
  private A objA = new A(); 
  private static B objB = new B(); 
 
  public Test() { 
      System.out.print("Test "); 
  } 
 
  public static void main(String[] args){ 
    System.out.print("Main "); 
    new Test(); 
  } 
} 