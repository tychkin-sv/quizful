package question_000;

public class Main {
//В какой строке(-ах) кода содержится ошибка:
// 3
    public static void main(String[] args) {
        int i = 1;            //1
        i = -+(10 + 2 + i);   //2
        //++i--;                //3
        System.out.println(i);
    }
}
