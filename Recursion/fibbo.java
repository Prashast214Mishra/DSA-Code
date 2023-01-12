package Recursion;
import java.util.Scanner;
public class fibbo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans =fibo(n);
        System.out.println(ans);

    }
    public static int fibo(int n){
         if(n<2){
             return n;
         }

        return fibo(n-1)+fibo(n-2);
    }
}
