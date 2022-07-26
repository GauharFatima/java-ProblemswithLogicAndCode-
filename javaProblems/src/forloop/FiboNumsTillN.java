package forloop;

import java.util.Arrays;
import java.util.Scanner;

public class FiboNumsTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] fibo=new int[n];
        for(int i=0; i<n; i++){
            if(i==0){
                fibo[i]=0;
            }else if (i==1){
                fibo[i]=1;
            }else {
                fibo[i]=fibo[i-1]+fibo[i-2];
            }
        }
        for(int num:fibo){
            System.out.println(num);
        }
    }
}
