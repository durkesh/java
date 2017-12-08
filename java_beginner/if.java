import java.util.*;
import java.lang.*;
import java.io.*;
class if
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int days;
      Scanner sc=new Scanner(System.in);
      days=sc.nextInt();
      if(days >= 50)
      {
        System.out.print("Box Office Hit");
      }
      if(days < 50 )
      {
        System.out.print("Flop");
      }
	}
}
