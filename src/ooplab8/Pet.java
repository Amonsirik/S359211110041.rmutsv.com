package ooplab8;

public class Pet {
    private String name;
    private String haircolor;
    private String gender;
    private int age;
    //constructor


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", haircolor='" + haircolor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


    public Pet(String name, String haircolor, String gender, int age) {
        //assign data to object properties
        this.name = name;
        this.haircolor = haircolor;
        this.gender = gender;
        this.age = age;
    }
    public void makeNoise() {
    }
    //getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

