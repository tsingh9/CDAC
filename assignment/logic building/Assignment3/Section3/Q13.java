public class Q13{
public static void main(String[] args) {



for(int i=1;i<=5;i++){

for(int j=1;j<=i;j++)
{  
if(i==1 || j==i  )
System.out.print(i);
	
else 
System.out.print(i+"*");

}
System.out.println();
}

for(int i=4;i>=1;i--){

for(int j=1;j<=i;j++)
{  
if(i==1 || j==i  )
System.out.print(i);
	
else 
System.out.print(i+"*");

}
System.out.println();
}


}
}