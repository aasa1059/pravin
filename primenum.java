import java.io.*;
import java.util.*;
class Prime1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;c=0;
a=sc.nextInt();
for(b=1;b<=a;b++){
if (a%b==0)
c=c+1;
}
if (c==2)
System.out.println("prime no");
else
System.out.println("non prime no");
}
}
