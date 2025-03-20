import java.io.*;
class Sumofn
{
public static void main (String args[])
{
try
{
InputStreamReader isr =new InputStreamReader (System.in);
BufferedReader br =new BufferedReader(isr);
System.out.println("SUM OF NUMBER ");
System.out.println("_____________________");
System.out.println("ENTER n VALUE");
String s1 = br.readLine();
int n = Integer.parseInt(s1);
System.out.println("RESULT");
int a = n*(n+1)/2;
System.out.println("SUM OF VALUE:"+a);
int b= n*(n+1)*(2*n+1)/6;
System.out.println("SUM OF SQUARE:"+b);
int c =(n*(n+1)/2)*(n*(n+1)/2);
System.out.println("SUM OF CUBE:"+c);
}
catch (Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}