package ifElseProblems;

import java.util.Scanner;

public class AlphaDigitOrSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("first charater is - ALPHABET");
        }else if(ch>='0' && ch<='9'){
            System.out.println("first charater is - DIGIT");
        }else {
            System.out.println("first charater is - SPECIAL CHARATER");
        }

    }
}
