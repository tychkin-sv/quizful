package question_027;

import java.util.EnumMap;
import java.util.Map; 
 
enum Types { A, B, C } 
 
public class Test { 
    static Integer value; 
    public static void main(String args[]) { 
        Map<Types, Integer> m = new EnumMap<Types, Integer>(Types.class); 
        m.put(Types.A, value); 
        System.out.println(m); 
    } 
} 