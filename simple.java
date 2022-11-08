import java.util.Scanner;

class simple{  
    public static void main(String args[]){  
     String a="x";
     int count =0;
     String b="";
     Scanner sc = new Scanner(System.in);
     while(a!=b){
        System.out.println("Enter a value");
        b=sc.nextLine();
        if(b.equals("x")){
            break;
        }
        int c=Integer.parseInt(b);
        count=count+c;
        
     }  
     System.out.println("Sum of the integers" + count);
    }  
}  