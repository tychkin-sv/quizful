package question_030;
//Можно ли из метода некоторого класса напрямую обратиться к приватному методу другого экземпляра этого же класса?
//Да, можно
class X {
  private int getX() { 
    return 5; 
  } 
 
  public int get2X() { 
    X x = new X(); 
    return 2 * x.getX(); 
  } 
}