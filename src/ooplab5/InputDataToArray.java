package ooplab5;

import java.util.Scanner;


//1.declare array as Integer ทำการประกาศตัวแปรขึ้นมาก่อน
//2.allow user to input data into array ให้ user inputข้อมูลใช้ในการแสดงค่าข้อมูลที่อยู่ใน อาร์เรย์
//3.show data in array โชว์ข้อมูล
public class InputDataToArray {
    private static int MAX =5;
    public static void main(String[] args) {
        Integer []num = new  Integer[MAX];
        //int []num2 = new int[MAX];
        num = inputData (num); //เรียกใช้ num ด้านล่าง
        showData (num);
    }//main

    private static void showData(Integer[] num) { //ตัวอย่างในการ showData จะแสดงค่าข้อมูลที่เราใส่
        System.out.println("Data in array;");
//        for (int i=0;i<num.length;i++){
//            System.out.print(num[i]+" ");
//        }
        // enhance loop ใช้ในกรณีที่เป็น อาร์เรย์ 1 มิติ
        for (int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    private static Integer[] inputData(Integer[] num) { //ตัวอย่างในการแสดง Output จำนวนเต็ม
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter an integer");
        for (int i = 0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }//inputData
}//class
