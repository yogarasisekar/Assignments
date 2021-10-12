import java.util.*;
class Num_word
{
public void number_to_word(int n,String str)
{
 String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve",
                                                      "thirteen","fourteen","fifteen","sisteen","seventeen",
                                                               "eighteen","nineteen"};
String ten[]={"","","twenty","thitry","forty","fifty","sixty","seventy","eighty","ninety"};
if(n>19)
{
System.out.println(ten[n/10]+""+one[n%10]);
}
else
{
System.out.println(one[n]);
}
if(n>0)
{
	System.out.println(str);
}
}
public static void main(String[]args)
{
  int n=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number:");
  n=s.nextInt();
  if(n<=0)
  {
    System.out.println("Enter greater than 0");
    }
   else
   {
     Num_word num=new Num_word();
  num.number_to_word((n/1000)%100,"thousand");
num.number_to_word((n/100)%10,"hundred");
num.number_to_word((n%100),"");
}
}
}
