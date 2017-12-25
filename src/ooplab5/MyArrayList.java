package ooplab5;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        //ArrayList สร้างค่าข้อมูล เก็บค่าข้อมูล
        ArrayList mylist  = new ArrayList();
        String name = "Preaw";
        mylist.add(name);
        System.out.println(mylist);
        mylist.add("Gift");
        mylist.add("Dee");
        System.out.println(mylist);
        mylist.add(2, "Hello");
        System.out.println(mylist);
        mylist.add(1,100);
        System.out.println(mylist);
        mylist.set(0,"Amon");
        System.out.println(mylist);
        mylist.remove("Hello");    //คำที่ต้องการลบออก
        System.out.println(mylist);
        mylist.remove(3);           //หรือใส่หมายเลขที่ต้องการลบ
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.get(2));
        System.out.println(mylist.indexOf(100)); // หาตำแหน่งที่มีค่า 100
    }//main
}//class