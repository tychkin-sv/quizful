package question_034;

//Что выведет в консоль следующий код?
//[one, two, four]

//Пояснение: CopyOnWriteArrayList - это разновидность List нормально переносит вызов метода remove() при перемещении по списку, не выдавая исключения ConcurrentModificationException.
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList; 
 
public class Test { 
 
    private static void removeAndPrint(List<String> list) { 
        for (String str : list) { 
            if (str.equals("two")) { 
                list.remove("three"); 
            } 
        } 
        System.out.println(list); 
    } 
 
    public static void main(String[] args) { 
        List<String> list = new CopyOnWriteArrayList<String>(); 
         
        list.add("one"); 
        list.add("two"); 
        list.add("three"); 
        list.add("four"); 
 
        removeAndPrint(list); 
 
    } 
} 