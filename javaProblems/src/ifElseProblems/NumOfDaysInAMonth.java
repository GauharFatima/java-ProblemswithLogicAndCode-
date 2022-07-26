package ifElseProblems;

import java.util.Scanner;

public class NumOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between(1-12) : ");
        int monthNum=sc.nextInt();//1 3 5 7 8 10 12 - 31 // 4 6 9 11 - 30 //2 - 28,29
        //you can solve this by using array also
        if(monthNum==4 || monthNum==6 || monthNum==9 || monthNum==11){
            System.out.println("There are 30 days in this month.");
        }else if(monthNum==2){
            System.out.println("There are 29 days (if leap year) or 28 days (if non leap year) in this month.");
        }else{
            System.out.println("There are 31 days in this month.");
        }
    }
}
