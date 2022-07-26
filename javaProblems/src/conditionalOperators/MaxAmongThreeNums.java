package conditionalOperators;

import java.util.Scanner;

public class MaxAmongThreeNums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter three numbers here: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=(n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2 : n3 ;

        System.out.println("Maximum among the three input numbers is : " + max);
    }
}
