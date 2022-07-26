package conditionalOperators;

import java.util.Scanner;

public class IsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any one character from the keyboard : ");
        char ch=sc.next().charAt(0);
        System.out.println((ch>='a' && ch<='z' || ch>='A' && ch<='Z') ?
                (ch + " is a character.") : (ch + " is not a character."));
    }
}
