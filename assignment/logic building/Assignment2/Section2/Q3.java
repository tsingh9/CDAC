import java.io.*;
import java.util.*;
 
public class Q3{
           public static void main(String[] args){
                       	Scanner sc=new Scanner(System.in);
                          System.out.print("Enter number 1: ");
						  float n1=sc.nextFloat();
                          System.out.print("Enter number 2: ");
						  float n2=sc.nextFloat();
						  System.out.print("Enter a operator: ");
						  char op=sc.next().charAt(0);
						  float result=0;
						  int count=0; 
						   switch(op){
						   
						   case '+':
						        result=n1+n2;
							    break;
						   case '-':
						        result=n1-n2;
								break;
						   case '*':
						        result=n1*n2;
								break;
						   case '/':
						        if(n2==0)
						        count=1;
								else
								result=n1/n2;
								break;
							default:
							    System.out.println("invalid operator");
							
								}
							
							if (count==0)
							System.out.println("Result: "+result);
							else
								{System.out.println("error-- division by 0 not possible");
								
							
								}
		   }





}