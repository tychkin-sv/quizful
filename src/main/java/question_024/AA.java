package question_024;

interface AA {
    int a(); 
} 
 
class A implements AA { 
    public int a() { 
        return 1; 
    } 
} 
 
class B implements AA { 
    public int a() { 
        return 1; 
    } 
}


class D implements AA {
    public int a() {


        return new A().a() + new B().a();
    }
}