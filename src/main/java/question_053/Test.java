package question_053;
//Выберите из приведенных единственный верный вариант вывода приложения при запуске его командой "java Test 1 two 3".
//Будет выведено NumberFormatException
//В метод main передаётся массив строк, содержащий параметры, указанные при запуске приложения из командной строки:
//args[0] → "1"
//args[1] → "Two"
//args[2] → "3"
//
//При попытке выполнить команду Integer.parseInt("Two") будет выброшено NumberFormatException.
//
//Аргументы можно задавать и при запуске приложения из IDE. Например, в Netbeans они указываются в "Свойства проекта" – "Выполнение" – "Аргументы".
public class Test {
    static public void main(String[] args) { 
        try { 
            int k = Integer.parseInt(args[1]); 
            System.out.println(args[k]); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 