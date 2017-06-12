import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner g=new Scanner(System.in);
		int n=g.nextInt();
		if(n%4==0)
		{
		    System.out.println("leapyear");
		}
		else if(n%4!=0)
		{
		    System.out.println("non leap year");
		}
	}
}
