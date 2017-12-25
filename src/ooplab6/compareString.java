package ooplab6;

public class compareString {
    public static void main(String[] args) {
        //compare String
        String m = "Hello ";
        String n = "Hello GGGG";

        //type 1 (==)        เป็นค่าเดียวกันหรือไม่
        if (m==n) System.out.println("yes.");
        else System.out.println("no.");

        //type 2 (equal())   เป็นค่าเท่ากันหรือไม่
        if (m.equals(n)) System.out.println("yes.");
        else System.out.println("no.");

        //type 3 (compareTo())   เป็นการเปรียบเทียบ
        if (m.compareTo(n)==0)System.out.println("yes."); //ถ้าค่าเท่ากันเป็น yes
        else if (m.compareTo(n)>= 1)
            System.out.println("no. +");                  //ถ้า m มากกว่า n เป็น no+
        else System.out.println("no. -");                 //ถ้า m น้อยกว่า n เป็น no-









    }//main
}//class
