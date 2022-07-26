package ifElseProblems;

import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers here : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n3;
        if(n1>n2 && n1>n3){
            max=n1;
        }else if(n2>n3){
            max=n2;
        }
        System.out.println("Maximum among the three is : " + max);
    }
}
