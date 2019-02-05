package question_033;
//Какой результат выполнения программы:

//Ошибка компиляции
public class Foo {
    public static void main(String[] args) {
        /*Без этого лабел не работает*/
        label: for (int k = 1; k <= 10; k++) {
            if (k % 5 == 0) break label; 
            System.out.print(k + " "); 
        }

        label:
        { 
            System.out.print("stop!"); 
        } 
    } 
}
/*
Пояснение: Компиляция выполнится с ошибкой.
Метки (label) используются в связке с break (или continue) для выхода (или пропуска итерации) в циклах for, while, do-while, к которым этот break (continue) относится.
*/