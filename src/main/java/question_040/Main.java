package question_040;
//Каким будет результат?
//Код не откомпилируется
//Пояснение: При выполнении арифметических действий со значениями типа byte, char, short,
// они неявно приводятся к типу int. Поэтому результат выражения b+1 также будет иметь тип int.
// Чтобы его можно было присвоить переменной k, нужно использовать явное приведение типа:

public class Main {
    public static void main(String[] args) { 
        byte b = 12; 
        byte k =1;/*= b + 1*/
        System.out.println(k); 
    } 
} 