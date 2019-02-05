package question_029;

public class VerySimpleClass {
  public static void main(String... args) { 
     for (byte i = 6, j = 0 ; (j += i++) <= 10; i >>= 1, System.out.print(--j)); 
  } 
} 