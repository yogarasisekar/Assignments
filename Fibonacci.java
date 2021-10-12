import java.util.*;
class Fibonacci
{
public static void main(String[]args)
{
int n1=0,n2=1,temp=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(temp<=n)
{
System.out.println(temp);
n1=n2;
n2=temp;
temp=n1+n2;
}

}
}