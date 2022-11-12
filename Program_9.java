
//problem statement: Input currency in rupees and output in USD.
//Time complexity:O(1)
//Space complexity:O(1)

//Output
// Enter the money in Rupess: 
// 300
// Enter the Conversion rate: 
// 64
// Money in US dollars: 4.6875

import java.util.*;
public class Program_9 {
    public static void main(String[] args) {
        int money;
        double rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the money in Rupess: ");
        money=input.nextInt();
        System.out.println("Enter the Conversion rate: ");
        rate=input.nextFloat();
        System.out.println("Money in US dollars: "+ (money/rate));
    }
}
