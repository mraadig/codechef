import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		for(int i=0;i<a;i++)
	{
	    int b=sc.nextInt();
	    if(b%2!=0)
	    {
	        System.out.println(-1);
	    }
	    else{
	      for(int j=b;j>0;j--)
	      {
	          
	          System.out.print(b+" ");b--;
	      }System.out.println("");
	    }
	}
	}
}
