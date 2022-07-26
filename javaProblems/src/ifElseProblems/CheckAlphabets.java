package ifElseProblems;

import java.util.Scanner;

public class CheckAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
            System.out.println("First charater is an ALPHABET");
        }else{
            System.out.println("First charater is NOT an ALPHABET");
        }
    }
}
