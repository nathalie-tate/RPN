/* RPN Calculator
 * Nathalie Tate
 * 2016
 *
 * This code is freely available under the terms of the MIT License. See 
 * LICENSE.txt for details.
 */
import java.util.Scanner;
import java.util.Stack;

public class RPN
{

	//b and a are backwards so division makes sense from the stack
  public static double rpn(double b, double a, char c) throws Exception
  {
    if(c!='=' && c!='+' && c!='-' && c!='*' && c!='/' && c!='%')
    {
      throw new Exception();
    }
		else if(c=='+')
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
		{
			if(b==0)
				System.exit(0);
      return a/b;
		}
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
    double a;
    String a_;
		Stack<Double> operands = new Stack<Double>();
		Stack<Character> operators = new Stack<Character>();
		Scanner in = new Scanner(System.in);
    while(true)
    {
     try{
			 a_=in.next();

			 try{
				 operands.push(Double.parseDouble(a_)); 
			 }catch(Exception e)
			 {
				 operators.push(a_.charAt(0));
				 operands.push(rpn(operands.pop(),operands.pop(),operators.pop()));
				 System.out.println(operands.peek());
				 System.out.println("_________________");
			 }

		 }catch(Exception e){
			 System.out.println("ERROR");
			 System.out.println("_________________");};
		}
	}
}
