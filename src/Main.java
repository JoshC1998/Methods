public class Main {
    public static void main(String[] args) {

        //String name = "Josh";
        //int age = 30;
        //hello(name,age);

       // int x =3;//int y =4;

       // int z = add(x,y);
       // System.out.println(z);
        double x=add(1.5,2.2,3.4);
        System.out.println(x);
    }

    static int add(int a,int b) {
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a,int b, int c) {
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d) {
       System.out.println("This is overloaded method #3");
       return a+b+c+d;
    }
    static double add(double a,double b) {
        System.out.println("This is overloaded method #4");
        return a+b;
    }
    static double add(double a,double b, double c) {
        System.out.println("This is overloaded method #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a+b+c+d;
    }


   // static void hello(String name, int age){
       // System.out.println("Hello "+name);
       // System.out.println("You are "+age);

    //static int add(int x, int y){
       // int z = x+y;
        //return z;


    }

