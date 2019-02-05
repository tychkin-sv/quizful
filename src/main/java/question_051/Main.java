package question_051;
//Каким будет результат компиляции и запуска данного кода:
//Super contructor
//Main(int) contructor
//Main() contructor
//
class Super {
    Super() { 
        System.out.println("Super contructor"); 
    } 
} 
 
public class Main extends Super { 
    Main() { 
        this(1); 
        System.out.println("Main() contructor"); 
    } 
    Main(int i) { 
        System.out.println("Main(int) contructor"); 
    } 
    public static void main(String [] args) { 
        new Main();   
    } 
} 