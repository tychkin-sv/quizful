package question_025;

class Aaa {
    private double x = 2; 
    public static void multX(Aaa a, double n){ 
        a.setX(a.getX()*n); 
    } 
    public double getX() {return x;} 
    public void setX(double xn) {x = xn;} 
    public static void trippleValue(double x){ 
        x*=3; 
    } 
    public static Aaa resetX(Aaa a){ 
        a = new Aaa(); 
        return a; 
    } 
    public static void main(String[] args) {         
     /*   trippleValue(x);
        Aaa anA = new Aaa(); 
        multX(anA,x); 
        resetX(anA); 
        x=0; 
        System.out.print(anA.getX());       */
    }  
}  