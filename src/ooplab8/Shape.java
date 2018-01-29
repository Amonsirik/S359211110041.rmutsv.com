package ooplab8;
// Abstract class
public abstract class Shape {         //ถ้ามี abatract class อยู่แล้วจะมีหรือไม่มี abstract int(method) ก็ได้
    private int Width;
    private int Length;

    public abstract double getArea();


    public Shape(int width, int length) {
        Width = width;
        Length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }
}//Shape
