package ooplab8;
//Application for Pet,Dog,Cat class
public class petApp {
    public static void main(String[] args) {
        dog dog = new dog("Bow",
                "whigth",
                "Female",
                2);
      System.out.println(dog.toString());
      cat cat = new cat("Gife",
              "Black",
              "male",
              3);
        System.out.println(cat.getClass()+" "+cat.toString());
       dog.makeNoise();  //เรียกเสียงร้องออกมา
       cat.makeNoise();

    }//main

}//class
