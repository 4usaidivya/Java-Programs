
//Problem Statement: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Time Complexity: O(1)
//Space Complexity: O(1)

//output
//case 1
// Enter 1st number: 
// 6
// Enter 2nd number: 
// 3
// Enter the operator(+,-,*,/): 
// /
// Division of two numbers: 2

//case 2
// Enter 1st number: 
// 6
// Enter 2nd number: 
// 0
// Enter the operator(+,-,*,/): 
// /
// Enter a valid number other than '0' for a second number

import java.util.*;
public class Program_7 {
    public static void main(String[] args) {
        int num1,num2;
        char op;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        num1=input.nextInt();
        System.out.println("Enter 2nd number: ");
        num2=input.nextInt();
        System.out.println("Enter the operator(+,-,*,/): ");
        op=input.next().charAt(0);
        if(op=='+'){
            System.out.println("Addition of two numbers: "+ (num1+num2));
        }else if(op=='-'){
            System.out.println("Subtraction of two numbers: "+ (num1-num2));
        }else if(op=='*'){
            System.out.println("Multiplication of two numbers: "+ (num1*num2));
        }else{
            if(num2!=0){
                // double a =num1;
                // double b = num2;
                // double c=a/b;
                System.out.println("Division of two numbers: "+ (num1/num2) );
            }else{
                System.out.println("Enter a valid number other than '0' for a second number");
            }
        }

        
    }
}
