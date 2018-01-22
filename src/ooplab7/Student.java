package ooplab7;

//design class
// taking about Student?
// 1. student id
// 2. name
// 3. major
// 4. group

public class Student {
    public static String faculty = "Management Technology";     //
    private String id;                //private การเป็นส่วนตัว ใช้งานเฉพาะภายใน class นั้น ๆ class อื่นไม่สามารถมองเห็น
    private String name;
    private String major;
    private String group;

    //constructor
    //default
    public Student(){}  //เมื่อไรก็ตามที่สร้าง student นี้ จะเรียกทำงานอันใดอันหนึ่ง
    public Student(String id,String n,String m,String g) {
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }//constructor

    //getter and setter methods
    //id
    public void setId(String id){
        this.id = id;

    }//setID
    public String getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
