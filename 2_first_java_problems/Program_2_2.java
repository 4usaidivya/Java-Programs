

//Problem Statement: Take name as input and print a greeting message for that particular name.
// Time complexity : O(1)
// Space complexity : O(1)

//Output
//Enter your name:Divya
//        Hello Divya!!!

import java.util.*;
public class Program_2_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your name:");
        System.out.println("Hello "+input.nextLine()+"!!!");

    }

}
