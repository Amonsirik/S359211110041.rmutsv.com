package ooplab4;

public class TestMethods {

    public static  void A(){
        System.out.println("Hello A");

    }// A
    public static  void B(int x,int y, String s){
        System.out.println(s);

    }//B
    public static  int C(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        // protected
        // private
        A();
        int x=5,y=10;
        B(x,y,"Hello");
//        Manage return value
//1.
        int z = C(x, y);
        System.out.println(z);
// 2.
        System.out.println(C(x,y));

    }//main
}//class