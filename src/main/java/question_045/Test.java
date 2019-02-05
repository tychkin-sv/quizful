package question_045;
//Что произойдет при выполнении такого кода:
//Ошибка компиляции в 7-й строке
//Пояснение: Ошибка компиляции возникает в 7-ой строке,
//потому что в коллекцию "b" можно добавлять только элементы типа Double и производного от него,
//а в коллекцию "a" можно добавлять элементы любого типа, так параметризованный тип Double в ней повышается до Object.
//
import java.util.*;
public class Test { 
    public static void main(String[] args) { 
        List a = new ArrayList<Double>();// 4 
        a.add("1.5");// 5 
        List<Double> b = new ArrayList();// 6 
       // b.add("1.5");// 7
        System.out.println(a + " " + b); 
    } 
}