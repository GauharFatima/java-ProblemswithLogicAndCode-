package ifElseProblems;

import java.util.Scanner;

public class MaxBtwTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TWO NUMBERS HERE: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int max=b;
        if(a>b){
            max=a;
        }
        System.out.println("MAXIMUM NUM IS : " + max);
    }
}
