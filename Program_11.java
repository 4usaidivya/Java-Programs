
//Problem Statement: To find out whether the given String is Palindrome or not.
//Time Complexity:O(n/2) = O(n)
//Space Complexity: O(1)

//Output
//Case 1
// Enter the string to check for Palindrome:
// abba
// abba is a Palindrome.

//Case 2
// Enter the string to check for Palindrome:
// geeks
// geeks is not a Palindrome.

import java.util.*;
public class Program_11 {
   public static void main(String[] args) {
    String sr;
    int flag=0,n;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string to check for Palindrome:");
    sr=input.nextLine();
    n= sr.length();
    for(int i=0;i<n/2;i++){
        if(sr.charAt(i)==sr.charAt(n-1-i)){
            flag=1;
        }else{
            flag=0;
            break;
        }

    }
    if(flag==0){
        System.out.println(sr+ " is not a Palindrome.");
    }else{
        System.out.println(sr+ " is a Palindrome.");
    }
   } 
}
