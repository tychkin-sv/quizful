package question_042;
//Что выведет на экран System.out.print при выполнении фрагмента кода?
//12
//Пояснение: Так как условие цикла не действительно, значение "x" не изменится.

public class Main {
    public static void main(String[] args) {
        int x = 12;
        while (x < 10) {
            x--;
        }
        System.out.print(x);
    }
}
