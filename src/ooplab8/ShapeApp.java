package ooplab8;

public class ShapeApp {                 //หาพื้นที่ 4 เหลี่นม
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(10,20);
        System.out.println("Width:"+rectangle.getWidth());
        System.out.println("Length:"+rectangle.getLength());
        System.out.println("Area:"+rectangle.getArea());

        Triangle triangle= new Triangle(20,2,30);
        System.out.println(triangle.getArea());


    }


}//ShapeApp
