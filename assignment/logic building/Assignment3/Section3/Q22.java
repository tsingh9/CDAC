public class Q22{
public static void main(String[] args) {
int n1=0;

for(int i=1;i<4;i++){
for(int k=1;k-i>1;k++)
{
System.out.print(" ");
}
if(n1<=9){
for(int j=9;n1-j>0;j--)
{

System.out.print("* ");

}
}
n1+=2;
System.out.println();

}	







int n2=2;
for(int i=5;i>=1;i--){
for(int k=1;i-k>1;k++)
{
System.out.print(" ");
}
if(n2<11){
for(int j=1;n2-j>0;j++)
{

System.out.print("* ");

}
}
n2+=2;
System.out.println();

}
} }