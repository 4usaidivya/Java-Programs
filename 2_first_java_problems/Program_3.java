import java.util.Scanner;


//Problem Statement: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Time Complexity: O(1)
// Space Complexity:O(1)

//Output
// Enter the principal value (P):5000
// Enter the Time value (T):5
// Enter the Rate value (R):3.5
// The simple Interest of a given values is: 875.0

import java.util.*;
public class Program_3 {
    public static void main(String[] args) {
        float si,p,t,r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal value (P):");
         p = input.nextFloat();
        System.out.print("Enter the Time value (T):");
        t = input.nextFloat();
        System.out.print("Enter the Rate value (R):");
        r = input.nextFloat();
        si =((p*t*r)/100);
        System.out.println("The simple Interest of a given values is: " +si);

    }
}
