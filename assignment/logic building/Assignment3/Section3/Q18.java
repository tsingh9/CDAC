public class Q18{
public static void main(String[] args) {
int n=2;
for(int i=5;i>1;i--){
for(int k=1;i-k>1;k++)
{
System.out.print(" ");
}
if(n<9){
for(int j=1;n-j>0;j++)
{

System.out.print("* ");

}
}
n+=2;
System.out.println();

}
} }