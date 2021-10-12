import java.util.*;
class Case_con
{
public static void main(String[]args)
{

String str="Mary has a little dog. she calls him Pun ";
String Lcase="";
String Ucase="";
String invert;
Lcase=str.toLowerCase();
Ucase=str.toUpperCase();
if(str==Lcase)
{
invert=Ucase;
System.out.println("Invert:"+invert);
}
else
{
System.out.println("Invert:"+Lcase);
}
String Firstletter=str.substring(0,1);
String remLetter=str.substring(1);
Firstletter=Firstletter.toUpperCase();
String Firstcap=Firstletter+remLetter;
System.out.println("Lowercase:"+Lcase);
System.out.println("Uppercase:"+Ucase);
System.out.println("Sentence case:"+Firstcap);
}
}