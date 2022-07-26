package ifElseProblems;

import java.util.Scanner;

public class NegPosOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive number");
        }else if(num<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
