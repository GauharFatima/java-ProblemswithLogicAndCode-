package ifElseProblems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER HERE: ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println(num + " - Even");
        }else{
            System.out.println(num + " - Odd");
        }
    }
}
