public class Q22{
public static void main(String[] args) {
int n1=9;

for(int i=1;i<=5;i++)
{
	for(int k=1;i-k>0;k++){
		
		System.out.print(" ");
		
	}
	
	for(int j=1;j<=n1;j++)
	{
		System.out.print("* ");
		
	}
	
	n1-=2;
	System.out.println();
	
}

int n2=3;
for(int i=5;i>1;i--){
for(int k=1;i-k>1;k++)
{
System.out.print(" ");
}
{
for(int j=0;j<n2;j++)
{
System.out.print("* ");
}
}
n2+=2;
System.out.println();

}






} }