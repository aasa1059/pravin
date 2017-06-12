import java.io.*;
import java.util.*;

class GFG {

	public static void main (String[] args) {
	    int sum=0,i;
		Scanner sc=new Scanner(System.in);
		sum=sc.nextInt();
		for(i=1;i<=10;i++)
		{
		    sum=sum+i;
		    System.out.println(sum);
		}
	}
}
