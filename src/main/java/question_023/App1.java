package question_023;

public class App1 {
    public static void main(String[] args) { 
        System.out.println(addToString("12345678910",',')); 
    } 

    /*
    Пояснение: Следует учитывать, что строка динамически изменяется:
    при i = 3 символ вставляется в 8-ю позицию; получаем b = "12345678,910", b.length() = 12
    при i = 6 символ вставляется в 5-ю позицию; получаем b = "12345,678,910", b.length() = 13
    при i = 9 символ вставляется во 2-ю позицию; получаем b = "12,345,678,910", b.length() = 14
    при i = 12 цикл продолжает выполняться (ведь 12 < 14),
    происходит попытка вставить символ в -1-ю позицию - и тут выбрасывается exception

    */
    public static StringBuffer addToString(String s, char c) {

        StringBuffer b = new StringBuffer(s); 
        int p = 0; 
        for (int i = 1; i < b.length(); i++) { 
            if (i%3 == 0) { 
                b.insert(b.length()-i-p, c);  
                p++; 
            } 
        } 
        return b; 
    } 
} 