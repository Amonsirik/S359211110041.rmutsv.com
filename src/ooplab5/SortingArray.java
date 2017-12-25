package ooplab5;

import sun.nio.cs.ext.MS874;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//1.allow user input data into array : inputData,showData
//2.find summation of data in array
//3.find average value in array
//4.find maximum value in array
//5.find minimum value in array
//6.sorting data in array (Descending order)
//7.sorting data in array (Ascending order)

public class SortingArray {
    private static int MAX =5;
    public static void main(String[] args) {
        Integer []num = new  Integer[MAX];
        //int []num2 = new int[MAX];
        num = inputData (num);
        ShowData (num);
        findSummation(num);
    }

    private static void findSummation(Integer[] num) {   //หาผลรวม
        Integer total= 0;
        for (int val:num)
            total +=val;
        System.out.println("The summation is :"+total);
        findAverage(total);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);

    }//findSummation

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascendind Order");
        Arrays.sort(num,Collections.reverseOrder());
        ShowData(num);
    }//AscendingOrder

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order");
        ShowData(num);    // showData (Arrays.sort(num));
    }//DescendingOrder

    private static void findMin(Integer[] num) {       //หาค่าที่น้อยที่สุด
        System.out.println("The Minimum value is: "+
                Collections.min(Arrays.asList(num)));
    }//findMinimum

    private static void findMax(Integer[] num) {   //หาค่ามากที่สุด
        System.out.println("The Maximum value is: "+
                Collections.max(Arrays.asList(num)));
    }//findMaximum

    private static void findAverage(Integer num) {        //หาค่าเฉลี่ย
        System.out.println("The averge value is:"+num/MAX);
    }//findAverage

    private static void ShowData(Integer[] num) {        //แสดงค่า
        System.out.println("Data in array;");
        for (int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter an integer");
        for (int i = 0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;


}//main
}//class
