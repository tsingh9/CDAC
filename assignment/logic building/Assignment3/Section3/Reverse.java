public class Reverse{
public static void main(String[] args) {
int n=1234;
int rev=0;
while(n>0){

int rem= n%10;
n=n/10;
rev=rev*10+rem;
}
System.out.println("Reverse of 1234 is: "+rev);
}
}
