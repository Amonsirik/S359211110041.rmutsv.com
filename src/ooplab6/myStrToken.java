package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//        StringTokenizer  เป็นการนับจำนวนคำ
        String msg = "Welcome to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreElements());{      //เป็นการอ่านคำทีละคำ
            StringBuffer myBuff = new StringBuffer(myToken.nextToken());
            System.out.print(myBuff.reverse() + " ");

        }





    }//main
}//class
