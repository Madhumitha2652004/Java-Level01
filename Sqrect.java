import java.io.*;
class Sqrect{
public static void main (String args[])
{
try
{
InputStreamReader isr =new InputStreamReader (System.in);
BufferedReader br =new BufferedReader(isr);
System.out.println("SQUARE AND RECTANGLE ");
System.out.println("_____________________");
System.out.println("ENTER a VALUE");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("ENTER l VALUE");
String s2 = br.readLine();
int l = Integer.parseInt(s2);
System.out.println("ENTER b VALUE");
String s3 = br.readLine();
int b = Integer.parseInt(s3);
System.out.println("RESULT");
int d= a*a;
System.out.println("AREA OF SQUARE :"+d);
int e=4*a;
System.out.println("PERIMETER OF SQUARE :"+e);
int f =l*b;
System.out.println("AREA OF RECTANGLE :"+f);
int g= 2*(l+b);
System.out.println("PERIMETER OF RECTANGLE :"+g);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}





