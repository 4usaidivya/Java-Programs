
//Problem statement: To find Armstrong Number between two given number.
//Time Complexity:O(log n)
//Space Complexity:O(1)

//Output
//Case 1
// Enter the number to check for armstrong number:
// 1634
// 1634 is a Armstrong number.

//case 2
// Enter the number to check for armstrong number:
// 120
// 120 is not a Armstrong number.

import java.util.*;
public class Program_9 {
   public static void main(String[] args) {
    int n,temp,a,b;
    int count=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number to check for armstrong number:");
    n=input.nextInt();
    temp =n;
    b= (int)Math.log10(n) + 1; //To find no of digits in the number

    while(n!=0){
        a=n%10;
        count=(int) (count+Math.pow(a, b));
        n=n/10;
    }
    if(temp==count){
        System.out.println(temp+" is a Armstrong number.");
    }else{
        System.out.println(temp+" is not a Armstrong number.");
    }
   } 
}
