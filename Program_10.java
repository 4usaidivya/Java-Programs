
//Problem Statement: To calculate Fibonacci Series up to n numbers.
//Time complexity:O(N)
//Space complexity:O(1)

//Output
//Enter the number for fibonacci series: 
// 10
// The fibonacci series upto 10 numbers
// 0 1 1 2 3 5 8 13 21 34

import java.util.*;
public class Program_10 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series: ");
        n = input.nextInt();
        System.out.println("The fibonacci series upto "+ n +" numbers");
        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
           
        }    

       
    }
}
