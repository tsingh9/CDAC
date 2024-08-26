import java.io.*;
import java.util.*;


public class Q2 {
        public static void main(String[] args)
                {
        
System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        String day=null;
        
 switch (n) {
    case 1, 2, 3, 4, 5:    

switch(n) {

case 1:
            day = "Monday";
            break;
       case 2:
            day = "Tuesday";
            break;
        case 3:
            day = "Wednesday";
            break;
        case 4:
            day = "Thursday";
            break;
        case 5:
            day= "Friday";
            break;

          }
          System.out.println(day +" is a weekday");
           break;


case 6, 7:
      switch(n) 
       {
        case 6:
            day = "Saturday";
              break;

   case 7:
            day = "Sunday";
            break;
}
System.out.println(day +" is a weekend");
break;

        default:
            System.out.println("Invalid number");

        }
        
    }
}
