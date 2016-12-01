/* RPN Calculator
 * Nathalie Tate
 * 2016
 *
 * This code is freely available under the terms of the MIT License. See 
 * LICENSE.txt for details.
 */
import java.util.Scanner;

public class RPN
{

  public static double rpn(double a, double b, char c) throws Exception
  {
    if(c!='=' && c!='+' && c!='-' && c!='*' && c!='/' && c!='%')
    {
      throw new Exception();
    }
    if(c=='+')
      return a+b;  
    else if(c=='=')
    {
      if(a==b)
        return 1.0;
      else
        return 0.0;
    }
    else if(c=='-')
      return a-b;
    else if(c=='*')
      return a*b;
    else if(c=='/')
      return a/b;
    else if(c=='%')
      return a%b;
    else
      return 0;
  }  

  public static void main(String[] args)
  {
    System.out.println("RPN Calculator");
    System.out.println("Nathalie Tate");
    System.out.println("div by zero to quit");
    double a, b;
    String tmp;
    char c;
    while(true)
    {
     try{
      Scanner in = new Scanner(System.in);
      a=in.nextDouble();
      b=in.nextDouble();
      tmp=in.next();
      c=tmp.charAt(0);
      if(b==0 && c=='/')
        break;
      System.out.println(rpn(a,b,c));  
      System.out.println("_________________");
     }catch(Exception e){
       System.out.println("ERROR");
       System.out.println("_________________");};
    }
  }
}
