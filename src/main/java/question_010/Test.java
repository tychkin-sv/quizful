package question_010;

public class Test {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String(a);
        String c = a;
        char[] d = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println((a == c));
        System.out.println(a.equals(b));
    }
}
