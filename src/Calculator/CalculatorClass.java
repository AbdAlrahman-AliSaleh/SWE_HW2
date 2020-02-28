package Calculator;

public class CalculatorClass {
   
	
	public static double addFunction(double num1 , double num2)
	 {
		double result ;
		double n1=num1 , n2=num2;
		result =n1+n2;
		
		return result;
		
	 }//end add function 
 
public static double subFunction(double num1 , double num2)
{
	double result ;
	double n1=num1 , n2=num2;
	result =n1-n2;
	
	return result;
	
}//end sub function 

public static double multFunction(double num1 , double num2)
	 {
		double result ;
		double n1=num1 , n2=num2;
		result =n1*n2;
		
		return result;
		
	 }//end mult function 

public static double divideFunction(double num1 , double num2) 
	 {
		double result ;
		double n1=num1 , n2=num2;
		if(n2==0 || (n2==0&&n1==0))
		{
			throw new IllegalArgumentException();
			
		}
		else
		{
		result=n1/n2;
		
		return result;}
		
	 }//end add function 









}//end class
