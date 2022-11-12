//Problem Statement: Write a program to print whether a number is even or odd, also take input from the user.
//Time complexity: O(1)
//Space Complexity: O(1)

//Output
// ....Given number is even or odd....
//Case 1
// Enter a number:
// 24
// 24 is a Even number.

//Case 2
// Enter a number:
// 333
// 333 is a odd number.

//Case 3
// Enter a number:
// 0
// Enter a valid number other than 0

import java.util.*;
public class Program_4{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("....Given number is even or odd....");
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        if(num!=0){
             if(num%2==0){
            System.out.println(num + " is a Even number.");
             }else{
                System.out.println(num + " is a odd number.");
             } 
        }else{
            System.out.println("Enter a valid number other than 0");
        }
       
    }
}