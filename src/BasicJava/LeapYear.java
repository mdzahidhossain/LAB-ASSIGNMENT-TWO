package BasicJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year after 1582: ");
        final int inputYear = input.nextInt();
        if (inputYear < 1582){
            System.out.println("I can not count that far back.");
        }
        else if ((inputYear % 4 == 0 && inputYear % 100 > 0) || (inputYear % 400 == 0)) {
            System.out.println(inputYear + " is a leap year.");
        }
        else{
            System.out.println(inputYear + " is not a leap year.");
        }
    }
}