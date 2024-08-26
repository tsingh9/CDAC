import java.io.*;
import java.util.*;

public class Q1{
public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
System.out.println("Enter marks: ");
int g=sc.nextInt();
if(g>=90)
System.out.println("Grade: A");
else if(g>=80 && g<=89)
System.out.println("Grade: B");
else if(g>=70 && g<=79)
System.out.println("Grade: C");
else if(g>=60 && g<=69)
System.out.println("Grade: D");
else if (g<60)
System.out.println("Grade: F");

}
}
