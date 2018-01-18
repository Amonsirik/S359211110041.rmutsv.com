package MidTerm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int count = 0;
        int birthyear = 0;
        int year = 2561;

        for (int i=1;i<=3;i++){
            System.out.print("Enter Year: ");
            birthyear = Integer.parseInt(reader.readLine());

            int Age = year-birthyear;
            System.out.println("Age : "+Age);
            count++;
            if (count == 3) {
                System.out.println("Thank you.");
                break;
            }
        }

    }
}