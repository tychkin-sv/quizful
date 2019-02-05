package question_041;
//Что произойдет при компиляции и запуске следующего кода?
//компиляция пройдет успешно и программа выполнится без ошибок
//Элементы массивов при создании инициализируются нулями.
//
//При сравнении произойдет приведение типов byte -> int,
// а так как условие 0 != 0 всегда будет ложным, то в тело if
// поток выполнения программы не зайдет и исключение выброшено не будет.
public class Test {
 
    static int[] arrInstance = new int[100]; 
 
    public static void main(String[] args) { 
        byte[] arrLocal = new byte[100]; 
 
        for (int i = 0; i < 100; i++) 
            if (arrInstance[i] != arrLocal[i]) { 
                throw new IllegalStateException("error"); 
            } 
    } 
} 