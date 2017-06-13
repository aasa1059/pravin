import java.io.*;
import java.util.Scanner;
public class power
{
  public static void main(String arg[])	
  {
    int n,p,result=1;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    p=sc.nextInt();
 
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	 {
            result=result*n;
 	 }	    
     }
    System.out.println(n+"^"+p+"="+result);
	
  }
}
