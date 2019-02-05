package question_039;
//Каким будет результат компиляции и выполнения следующего кода:
//values: one two three
//Пояснение: Анонимный класс наследуется от ArrayList, вызывается конструктор ArrayList,
// вызывается инициализатор анонимного класса, вызывается конструктор анонимного класса
import java.util.List;
import java.util.ArrayList; 
 
public class Test { 
    public static void main(String[] args) { 
        List<String> values = new ArrayList<String>() { 
            { 
              add("one"); 
              add("two"); 
              add("three"); 
            } 
        }; 
        System.out.print("values: ");    
        for (String value : values) { 
            System.out.print(value + " "); 
        } 
    } 
} 