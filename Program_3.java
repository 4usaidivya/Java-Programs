
//Problem Statement: Input a year and find whether it is a leap year or not.
//Time Complexity: O(1) because we are getting output from one if condition.
//Space Complexity:O(1) //No additional space is used.

//Explanation
//A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
//A leap year (except a century year) can be identified if it is exactly divisible by 4.


//Output
//Case 1
// Enter the Year:
// 2012
// 2012 is a leap year.
//Case 2
// Enter the Year:
// 1900
// 1900 is not a leap year.

import java.util.*;
class Program_3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int year=0;
        System.out.println("Enter the Year:");
        year=sc.nextInt();
        if((year%400==0) || ((year%4==0)&&(year%100!=0))){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }

    }
    
}