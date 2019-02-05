package question_026;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        System.out.println(-a % b);
        System.out.println(a % -b);
        System.out.println((-a % b) == (a % -b));
    }
}
