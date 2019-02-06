package question_056;
//Что будет выведено на экран в результате выполнения программы ?
//5
//Пояснение: Метод split() используется для декомпозиции определённой строки в набор подстрок,
//основываясь на заданном регулярном выражении. В данном случае используется символ пробела как разделитель строки.

public class Main {
    public static void main(String[] args) { 
        try { 
            String testString = "This is a test string."; 
            String[] resultArray = testString.split(" "); 
            System.out.println(resultArray.length); 
        } 
        catch (Exception ex) { 
            System.out.println("exception"); 
        } 
    } 
} 