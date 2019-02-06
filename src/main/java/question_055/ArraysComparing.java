package question_055;
//Что будет напечатано в результате выполнения данного кода?
//false
//true
//true
//Пояснение: В массивах i1 и i2 ссылки на вложенные массивы разные, поэтому первый equals вернет false.
//Во втором случае ссылки будут одинаковыми, соответственно true.
//В третьем случае производится сравнение элементов, все одинаковы, поэтому true

import java.util.Arrays;
class ArraysComparing { 
    public static void main(String...args) { 
        int[] i1[] = {{1,2,3}, {0,0,0}}; 
        int[][] i2 = {{1,2,3}, {0,0,0,}}; 
        int[][] i3 = new int[2][3]; 
        System.arraycopy(i1, 0, i3, 0, i3.length); 
        System.out.println(Arrays.equals(i1, i2)); 
        System.out.println(Arrays.equals(i1, i3)); 
        System.out.println(Arrays.deepEquals(i1, i2)); 
    } 
} 