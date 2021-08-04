package Java.Pract;

public class Test 
{
	public static void main(String args[])
	{
		try
		{
			bedMethod();
			System.out.println("A");
		}
		catch(Exception ex)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
	public static void bedMethod()
	{
		System.out.println("Test");
	}
}
