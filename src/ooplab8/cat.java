package ooplab8;

public class cat extends Pet{
    public cat(String name, String haircolor, String gender, int age) {
        super(name, haircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meaw Meaw !!!");
    }
}
