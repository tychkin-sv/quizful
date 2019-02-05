package question_018;

public class Test {
    /*
    Пояснение: s.concat() не изменит значения s, так как String это "immutable"(неизменяемый) объект, в отличии от StringBuffer, который реализует изменяемые строки
     */
    public static void main(String[] args) { 
        String s = new String("ssssss"); 
        StringBuffer sb = new StringBuffer("bbbbbb"); 
        s.concat("-aaa"); 
        sb.append("-aaa"); 
        System.out.println(s); 
        System.out.println(sb); 
    } 
} 