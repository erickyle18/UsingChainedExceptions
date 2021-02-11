
public class UsingChainedExceptions {
	
	public static void main(String[] args) {
		
		try
		{
			method1();
		}
		catch(Exception exception)	//catch the exception(s) thrown from method1
		{
			exception.printStackTrace();
		}
	}	//end main method
	
	//call method2; throw exception(s) back to main
	public static void method1() throws Exception
	{
		try
		{
			method2();
		}	//end try
		catch(Exception exception)
		{
			throw new Exception("Exception thrown in method1", exception);
		}
	}
	
	//call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		try
		{
			method3();
		}
		catch(Exception exception)
		{
			throw new Exception("Exception thrown in method2", exception);
		}
	}
	
	//throw Exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}
	
}	//end class UsingChainedExceptions
