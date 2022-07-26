package ifElseProblems;

import java.util.Scanner;

public class UpperOrLowercaseAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet : ");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase Alphabet");
        }else if (ch>='A' && ch<='Z') {
            System.out.println("Uppercase Alphabet");
        }else{
            System.out.println("Invalid input (its not an alphabet)");
        }
    }
}
