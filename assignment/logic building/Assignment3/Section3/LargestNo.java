public class LargestDigit{
public static void main(String[] args) {

int n=4825;
int l=0;
while(n>0){

int rem=n%10;
n=n/10;

if (rem>l)
l=rem;

}
System.out.println("Largest digit is: "+l);
}
}