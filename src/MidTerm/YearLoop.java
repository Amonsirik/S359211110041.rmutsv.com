package MidTerm;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        int count = 0;
        int birthday = 2532;
        int year = 2561;
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("Enter Year: ");
                birthday = Integer.parseInt(reader.readLine());
            }
                int Age = 2561 - birthday;

                System.out.println("Age : " + Age);
                count++;
                if (count == 3) {

                }
            }
        }
    }

