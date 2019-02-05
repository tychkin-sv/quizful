package question_017;

public class MyTest {
    public static void main(String[] args) {         
        label1: for (int i = 0; i < 3; i++) { 
            if (i == 1) 
                continue label1;  
            label2: 
                System.out.print(/*i+*/"TEST ");
            label3:; 
        } 
    } 
}