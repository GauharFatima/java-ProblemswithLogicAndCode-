package conditionalOperators;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        System.out.println((year%100==0 && year%400==0) ? "LEAP YEAR" :
                (year%100!=0 && year%4==0) ? "LEAP YEAR" : "NON LEAP YEAR"); ;
    }
}
