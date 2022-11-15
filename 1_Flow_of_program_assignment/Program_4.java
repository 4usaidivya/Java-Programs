//Problem Statement:Take 2 numbers as inputs and find their HCF and LCM.
//Time complexity: O(min(a,b)).
//Space Complexitty: O(1) or Constant. Because we are not using any additional memory.

//Output
// Enter the value of 1st number:
// 8
// Enter the value of 2nd number:
// 18
// HCF of given two numbers is:2
// LCM of given two numbers is:72

import java.util.*;
class Program_4{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int num1 =0;
        int num2=0;
        System.out.println("Enter the value of 1st number:");
        num1=sc.nextInt();
        System.out.println("Enter the value of 2nd number:");
        num2=sc.nextInt();
        int gcd=gcd(num1,num2);
        System.out.println("HCF of given two numbers is:"+gcd);
        if(gcd!=0){
            int lcm=(num1*num2)/gcd;
            System.out.println("LCM of given two numbers is:"+lcm);

        }
        


    }
    public static int gcd(int n1, int n2){
       int min=(n1>n2) ? n1: n2;
       int gcd=0;
       for(int i=1;i<=min;i++){
        if((n1%i==0)&&(n2%i==0)){
            gcd=i;
        }

       }
        return gcd;

    }
}