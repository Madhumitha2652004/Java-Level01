import java .io.*;
class Ebill
{
public static void main (String args[])
{
try
{
DataInputStream dis = new DataInputStream (System.in);
System.out.println("GOVERMENT OF TAMILNADU");
System.out.println("ELECTRICITY BILL");
System.out.println("----------------------");
System.out.println("ENTER THE EBILL");
String s1= dis.readLine();
int a= Integer.parseInt(s1);
System.out.println("ENTER THE COUSTOMER NAME");
String s2 =dis.readLine();
System.out.println("ENTER THE PREVIOUS UNIT:");
String s3 = dis.readLine();
int b = Integer.parseInt(s3);
System.out.println("ENTER THE CURRENT UNIT:");
String s4 = dis.readLine();
int c = Integer.parseInt(s4);
System.out.println("RESULT");
int d = c-b;
System.out.println("UNIT CONSUMED"+d);
int e= d*5;
System.out.println("TOTAL AMOUNT:"+e);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}
