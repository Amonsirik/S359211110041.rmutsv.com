package ooplab6;

public class myString {
    public static void main(String[] args) {
      String msg1 = "Amon";
      System.out.println(msg1);
      char []c = {'H', 'e','l','l','o'};
      String msg2 = new String(c);
      System.out.println(msg2);

        //concatination String
        //type 1 (+)
        String msg3 = msg2 +" "+ msg1;
        System.out.println(msg3);
        System.out.println(msg3.length());   //เป็นการนับจำนวนตัวอักษร

        //type 2 (concat())
        String msg4 = msg3.concat(" RMUTSV");   //เอาคำมาต่อท้ายแล้วแสดงออกเป็น MSUTSV
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase()); // พิมพ์เล็กหมด
        System.out.println(msg4.toUpperCase());  //เป็นพิมพ์ใหญ่ทั้งหมด
        System.out.println(msg4.substring(5,10)); //ตัดข้อความบางส่วน

        //trim() เป็นการตัดทั้งด้านซ้ายและขวา
        String msg5 = "Hello";
        System.out.println("*" +msg5+"*");
        System.out.println("*" +msg5.trim()+"*");


    }//main
}//class
