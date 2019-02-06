package question; 
 
import java.io.BufferedOutputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.PrintStream; 
 
public class TestOutput { 
    public static void main(String[] args) throws IOException { 
        PrintStream out = new PrintStream( 
                   new BufferedOutputStream(new FileOutputStream("test.out"))); 
        PrintStream console = System.out; 
        System.setOut(console); 
 
        System.out.println("FIRST OUTPUT");
        int k=2;
        System.out.println(k>>3<<k == k>>1<<k);

        Integer i1 = 10;
        Integer i2 = 10;

        Double d1 = 10d;
        Double d2 = 10d;

        System.out.println(i1 == i2);
        System.out.println(d1 == d2);


        System.setOut(out); 
 
        System.out.println("SECOND OUTPUT"); 
 
        out.close(); 
 
        System.out.println("THIRD OUTPUT");
        new Object();

    } 
}

/**
 * Перечислите все методы, которые есть у класса Object.
 * equals
 * toString
 * hashCode
 * clone
 * notify()
 * wait()
 */

//Наследует ли класс конструкторы своего суперкласса?
//Нет
//Пояснение: Класс-потомок явно или неявно вызывает конструкторы класса-предка, но не наследует их.

//Что будет, если единственный конструктор объекта объявлен как final?
//Конструктор не может быть объявлен как final 11187 / 17100
//Пояснение: Единственные модификаторы, разрешенные для конструкторов: public, protected, private.

//Можно ли динамически менять размер массива?
//Нет, нельзя

//Может ли класс быть объявлен с модификатором transient?
//Нет
//Пояснение: Только поля класса могут быть объявлены как transient. Это ключевое слово говорит о том, что значение поля не нужно сохранять при сериализации.

//Выберите модификаторы, применимые к полям класса:
//volatile
//static
//Пояснение: К полям класса применимы модификаторы public, protected, private, static, final, transient, volatile.


//Можно ли при объявлении класса использовать модификаторы abstract и final одновременно?
//Нет
//Пояснение: Эти два модификатора являются взаимоисключающими:
//– abstract используется, чтобы показать, что класс имеет неполную реализацию, или его следует рассматривать таковым;
//– final применяется к полностью реализованным классам, для которых не нужны (нежелательны) подклассы, чтобы обеспечить надёжность и/или производительность.

//System.out.println( 0.3 == 0.1d + 0.1d + 0.1d );
//false
//Пояснение: Правильный ответ на этот вопрос связан со способом представления дробных чисел в памяти компьютера. Напомним, что они хранятся в двоичном коде.
//
//Если попробовать перевести 0.1 в двоичную систему счисления, то получится БЕСКОНЕЧНАЯ двоичная дробь 0,000110011001100110011001100... Поскольку в памяти компьютера число представляется с помощью КОНЕЧНОГО количества двоичных разрядов (например, под значение типа double отводится 64 бита), то бесконечная двоичная дробь просто округляется. То число, которое получается в результате округления, будет чуть-чуть (на одну многомиллионную) отличаться от 0.1. Аналогично, двоичное представление для 0.3 будет чуть-чуть отличаться от 0.3.
//Получается, что в примере сравниваются два числа, каждое из которых примерно равны 0.3, но они не равны между собой.
//Если взять числа с другим двоичным представлением, будет другой результат. Например, System.out.println( 0.375 == 0.125d + 0.125d + 0.125d ) выводит true.
