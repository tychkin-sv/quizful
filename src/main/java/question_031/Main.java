package question_031;
//Что произойдет в результате выполнения следующего кода?
//На экран выведется число -128
public class Main {
    public static void main(String args[]) { 
        byte b = 0; 
        while (++b > 0); 
        System.out.println(b); 
    } 
} 