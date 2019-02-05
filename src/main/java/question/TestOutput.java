package question; 
 
import java.io.BufferedOutputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.PrintStream; 
 
public class TestOutput { 
    public static void main(String[] args) throws IOException { 
        PrintStream out = new PrintStream( 
                   new BufferedOutputStream(new FileOutputStream("test.out"))); 
        PrintStream console = System.out; 
        System.setOut(console); 
 
        System.out.println("FIRST OUTPUT"); 
 
        System.setOut(out); 
 
        System.out.println("SECOND OUTPUT"); 
 
        out.close(); 
 
        System.out.println("THIRD OUTPUT");
        new Object();
    } 
}

/**
 * Перечислите все методы, которые есть у класса Object.
 * equals
 * toString
 * hashCode
 * clone
 * notify()
 * wait()
 */
