
//Problem Statement: To calculate Fibonacci Series up to n number.
//Time complexity:O(N)
//Space complexity:O(1)

//Output
// Enter the number for fibonacci series: 
// 7
// The fibonacci series upto 7 numbers
// Fibonaci series of 7th digit: 8

import java.util.*;
public class Program_7 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series: ");
        n = input.nextInt();
        System.out.println("The fibonacci series upto "+ n +" numbers");
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
           
        } 
        System.out.println("Fibonaci series of "+n+"th digit: "+c);   

       
    }
}
