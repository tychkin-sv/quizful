package question_006;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // наиболее соответствует, т.к. область видимости!!!!! int i
        {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        }
    }
}
