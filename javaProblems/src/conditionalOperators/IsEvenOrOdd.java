package conditionalOperators;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int num=sc.nextInt();

        System.out.println((num%2==0) ? "Even Number" : "Odd Number");
    }
}
