

public class Sum{
public static void main(String[] args) {

int n=9876;
int sum=0;
while(n>0){

int rem=n%10;
n=n/10;
 sum = sum+rem;
 }
 System.out.println(sum+ " (9+8+7+6)");

}
}