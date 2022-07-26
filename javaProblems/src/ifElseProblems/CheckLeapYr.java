package ifElseProblems;

import java.util.Scanner;

public class CheckLeapYr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yr=sc.nextInt();
        if(yr%100==0 && yr%400==0){
            System.out.println("LEAP YEAR");
        }else if(yr%100!=0 && yr%4==0){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NON LEAP YEAR");
        }
    }
}
