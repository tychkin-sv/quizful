package question_057;
//Что напечатает следующий код:
//55
//
public class MainClass {
    public static void main(String[] arg) {
    int limit = 10;
     int sum = 0;

      int i = 1;
       for (; i <= limit;) {
         sum += i++;
        }
    System.out.println(sum);
   }
}
