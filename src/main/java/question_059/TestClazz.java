package question_059;
//Укажите все утверждения, которые верны относительно следующего фрагмента кода:
//!!!Возникнет ошибка компиляции в строке 2
//Пояснение: long Byte - объявляется переменная с именем Byte и типом long.
//У примитивов нет метода equals.

public class TestClazz {
    public static void main(String[] args) { 
        final long Byte = 0;            // 1 
        if ( Byte==0/*.equals(0)*/ ) {        // 2
            System.out.print("=="); 
        } else { 
            System.out.print("!="); 
        } 
    } 
} 