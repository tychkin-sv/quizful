package question_054;
//Какой будет результат компиляции и выполнения нижеприведенного кода?
//Ошибка компиляции
//Пояснение: Переменнная "i" существует только в пределах цикла.
//В строке 5 она уже за пределами видимости.

public class Main {
    public static void main(String[] args) {
          for (int i = 0; i <= 10 ; i++) {
                 if (i > 6) break;
                }
           //System.out.println(i);
      }
}
