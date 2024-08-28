public class Q18{
public static void main(String[] args) {
int n=2;
for(int i=5;i>1;i--){
for(int k=1;i-k>1;k++)
{
System.out.print(" ");
}
if(n<11){
for(int j=1;n-j>0;j++)
{
System.out.print("* ");
}
}
n+=2;
System.out.println();

}
int n1=5;

for(int i=1;i<=3;i++)
{
	for(int k=1;i-k>=0;k++){
		
		System.out.print(" ");
		
	}
	
	for(int j=1;j<=n1;j++)
	{
		System.out.print("* ");
		
	}
	
	n1-=2;
	System.out.println();
	
}






} }


