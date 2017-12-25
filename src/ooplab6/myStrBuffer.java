package ooplab6;

public class myStrBuffer {
    public static void main(String[] args) {
//       StringBuffer   เป็นการใส่ค่าข้อความใน append
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append("2017");
        System.out.println(buffer);
        buffer.replace(0,5,"University of");   //เปลี่ยนข้อมูลตำแหน่ง 0-5
        System.out.println(buffer);
        System.out.println(buffer.reverse());               //เป็นการสลับข้อความจากข้างหน้ามาข้างหลัง
        buffer.setCharAt(0,'T');                    //เป็นการสลับค่าข้อความ
        System.out.println(buffer);

    }//main
}//class
