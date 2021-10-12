import java.util.*;
class Factorial
{
static int factorial(int n)
{
if(n==0)
return 1;
else
return(n* factorial(n-1));
}
public void number_to_word(int fact,String str)
{
 String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve",
                                                      "thirteen","fourteen","fifteen","sisteen","seventeen",
                                                               "eighteen","nineteen"};
String ten[]={"","","twenty","thitry","forty","fifty","sixty","seventy","eighty","ninety"};
if(fact>19)
{
System.out.println(ten[fact/10]+""+one[fact%10]);
}
else
{
System.out.println(one[fact]);
}
if(fact>0)
{
	System.out.println(str);
}
}
public static void main(String[]args)
{
int i,fact=1;
Scanner s=new Scanner(System.in);
int num=s.nextInt();
fact=factorial(num);
System.out.println(fact);

if(fact<=0)
  {
    System.out.println("Enter greater than 0");
    }
   else
   {
     Factorial f=new Factorial();
  f.number_to_word((fact/1000)%100,"thousand");
f.number_to_word((fact/100)%10,"hundred");
f.number_to_word((fact%100),"");
}
}
}