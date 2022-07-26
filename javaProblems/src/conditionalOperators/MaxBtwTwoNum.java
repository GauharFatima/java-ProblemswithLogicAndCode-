package conditionalOperators;

import java.util.Scanner;

public class MaxBtwTwoNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two numbers here: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=(n1>n2) ? n1 : n2;
        System.out.println("Maximum number between the two input numbers is : " + max);
    }
}
