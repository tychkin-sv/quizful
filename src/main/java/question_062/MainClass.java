package question_062;
//Какой результат выполнения следующего кода:
//true
//Пояснение: Последовательность выполнения и результаты операций следующие:
//
//
//1.    k << 3 = 16 (0000 0010b << 3 = 0001 0000b)
//2.    16 >> 2 = 4 (0001 0000b >> 2 = 0000 0100b)
//3.    k >> 1  = 1 (0000 0010b >> 1 = 0000 0001b)
//4.    1 << k = 4  (0000 0001b << 2 = 0000 0100b)

public class MainClass {
    public static void main(String args[]) { 
        int k = 2; 
        System.out.println( k << 3 >> k == k >> 1 << k); 
    } 
} 