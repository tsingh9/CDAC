import java.io.*;
import java.util.*;

public class Q4{
    public static void main(String[] args)
	{   
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter total purchase: ");
	  double tp=sc.nextDouble();
	  sc.nextLine();
	  System.out.print("Do you have membership card-Yes or No: ");
	  String member=sc.next();
	  double discount=0;
	  
	  switch(member){
	  
	  case "Yes", "yes":
	  
	  
	  if(tp>=1000){
	  discount=25*tp/100;
	  
	  }
	  
	 if(tp>=500 && tp<=999){
	  discount=15*tp/100;
	  
	  }
	   if(tp<500){
	  discount=10*tp/100;
	  
	  }
	  break;
	  
	  case "No", "no":
	    
	  
	  if(tp>=1000){
	  discount=20*tp/100;
	  
	  }
	  
	 if(tp>=500 && tp<=999){
	  discount=10*tp/100;
	  
	  }
	   if(tp<500){
	  discount=5*tp/100;
	  
	  }
	  break;
	  
	  default:
	  System.out.print("Invalid value");
	  }
	  System.out.println("Total discount: "+discount);
	  
	  
	  
	  
	  
	  
	
	
	
	
	
	}





}