package question_009;
//Дан следующий код:
//Возникнут ли ошибки компиляции и если да, то в каких строках?
//Ошибка компиляции в строке 1
public class Foo {
    private Foo() { 
        /*return this;   конструктор не может возвращать !!!  */       // 1
    } 
    public static Foo get() { 
        return new Foo();       // 2 
    } 
    public static void main(String[] args) { 
        Foo foo1 = get();       // 3 
        Foo foo2 = new Foo();   // 4 
    } 
} 