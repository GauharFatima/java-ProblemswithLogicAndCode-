package ifElseProblems;

import java.util.Scanner;

public class DayNameOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number from 1 to 7 : ");
        int day=sc.nextInt();
        if(day==1){
            System.out.println("First day of the week is Monday."); // or you can simply print monday
        }else if (day==2){
            System.out.println("Second day of the week is Tuesday.");
        }
        else if (day==3){
            System.out.println("Third day of the week is Wednesday.");
        }
        else if (day==4){
            System.out.println("Forth day of the week is Thursday.");
        }
        else if (day==5){
            System.out.println("Fifth day of the week is Friday.");
        }
        else if (day==6){
            System.out.println("Sixth day of the week is Saturday.");
        }else{
            System.out.println("Last day of the week is Sunday.");
        }
    }
}
