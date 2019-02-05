package question_036;

//Что напечатает следующий код?
// Методы!! для полей вызывать можно!!!!
//
/*      Static block
        Y variable
        Block
        X variable
*/
public class Test {
    { 
        System.out.println("Block"); 
    } 
    int x = getX(); 
 
    static { 
        System.out.println("Static block"); 
    } 
 
    public int getX() { 
        System.out.println("X variable"); 
        return 5; 
    } 
 
    static int y = getY(); 
    public static int getY() { 
        System.out.println("Y variable"); 
        return 6; 
    } 
 
 
    public static void main(String[] args) { 
        Test m = new Test(); 
    } 
} 