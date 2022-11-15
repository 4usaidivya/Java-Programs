//Problem statement: Reverse the given number.
//Time complexity:O(log N)
//Space complexity:O(1);

//Output
// Enter the number to reverse:
// 7468321
// The revere number of 7468321is :1238647


import java.util.*;

public class Program_13 {
    public static void main(String[] args) {
        int num,a,temp;
        int reverse=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        num=input.nextInt();
        temp=num;
        while(num!=0){
            a=num%10;
            reverse=reverse*10+a;
            num=num/10;
        }
        System.out.println("The revere number of "+temp+"is :"+ reverse);


    }
}
