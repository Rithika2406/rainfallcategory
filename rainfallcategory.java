import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    if(x<3)
		    {
		        System.out.println("LIGHT");
		    }
		    else if(x>=3 && x<7)
		    {
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}

	}
}
