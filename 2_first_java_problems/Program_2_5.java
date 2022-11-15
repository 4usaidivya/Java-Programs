
//Problem Statement: Take 2 numbers as input and print the largest number.
//Time Complexity: O(1)
//Space Complexity: O(1)

//Output
// Enter the 1st number: 
// 4
// Enter the 2nd number: 
// 5
// Largest number is: 5

import java.util.*;
public class Program_2_5 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        num1=input.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2=input.nextInt();
        if(num1>num2){
            System.out.println(("Largest number is: "+num1 ));
        }else{
            System.out.println(("Largest number is: "+num2));
        }
    }
    
}
