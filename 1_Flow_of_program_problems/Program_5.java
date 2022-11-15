import java.util.Objects;
import java.util.Scanner;
//Program Statement: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
//Space Complexity: O(1).
  
//Output
//Enter a value
//4
// Enter a value
// 5
// Enter a value
// 6
// Enter a value
// x
// Sum of the integers 15


class Program_5 {  
    public static void main(String args[]){  
     String a="x";
     int count =0;
     String b="";
     Scanner sc = new Scanner(System.in);
     while(!Objects.equals(a, b)){
        System.out.println("Enter a value");
        b=sc.nextLine();
        if(b.equals("x")){
            break;
        }
        int c=Integer.parseInt(b);
        count=count+c;
        
     }  
     System.out.println("Sum of the integers " + count);
    }  
}  