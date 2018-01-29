package ooplab8;

public class dog extends Pet{
    public dog(String name, String haircolor, String gender, int age) {
        super(name, haircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");

    }
}//dog


//extends คือคำสั่งที่บอกการสืบทอมาจาก Pet
//Alt+Enter ขึ้นสีแดง เลือกตัวแรก
