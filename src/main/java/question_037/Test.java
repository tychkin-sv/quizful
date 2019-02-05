package question_037;
//Что будет выведено на экран?
// 3
//Пояснение: Метод printX() выводит на экран значение, которое возвращает метод getX().
// При этом вызывается перекрытый метод из класса B, который возвращает x+1,
// причём значение поля x также берётся из класса B.
class A {
    int x = 1; 
 
    public void printX() { 
        System.out.println(getX()); 
    } 
 
    public int getX() { 
        return x; 
    } 
} 
 
class B extends A { 
    int x = 2; 
 
    public int getX() { 
        return x + 1; 
    } 
} 
 
public class Test { 
    public static void main(String[] args) { 
        A classA = new B(); 
        classA.printX();

        int i; i =+-(10+30);
        //++i--;
        System.out.println(0.3 == 0.1d+0.1d+0.1d);

        String s= 12-3+"";
        System.out.println(s);
    } 
}