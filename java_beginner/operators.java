import java.util.*;
import java.lang.*;
import java.io.*;
class operators
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc=new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
boolean a1 = true;
      boolean b1 = false;
      System.out.println("a+b is"+(a+b));
      System.out.println("a-b is"+(a-b));
      System.out.println("a*b is"+(a*b));
      System.out.println("b/a is"+(b/a));
      System.out.println("b%a is"+(b%a));
      System.out.println("b++ is"+(b++));
      System.out.println("b-- is"+(b--));
      System.out.println("a&b is"+(a&b));
      System.out.println("a|b is"+(a|b));
      System.out.println("a^b is"+(a^b));
      System.out.println("~a is"+(~a));
      System.out.println("a<<2 is"+(a<<2));
      System.out.println("a>>2 is"+(a>>2));
      System.out.println("a>>>b is"+(a>>>b));
      System.out.println("a1&&b1 is"+(a1&&b1));
      System.out.println("a1||b1 is"+(a1||b1));
      System.out.println("!(a1&&b1) is"+(!(a1&&b1)));
	}
}
