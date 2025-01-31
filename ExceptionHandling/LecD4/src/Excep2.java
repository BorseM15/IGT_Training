import java.io.IOException;
import java.sql.*;
 

//if have to throw checked exception then throws must be use
//when unchecked exception use no need throws .just throw can use.
//try with try allow
//catch in try allow
//finally try allow
//final in try allow
//catch in try allow
//only try not allow. either catch or finally should be
class B2
{
		void display() throws IOException, SQLException, ABCException,NullPointerException,ArrayIndexOutOfBoundsException
		{
			for(int i=0;i<=20;i++)
			{
				System.out.println("I :"+i);
				if(i==18) throw new NullPointerException();
				if(i==16) throw new ArrayIndexOutOfBoundsException();
				if(i==14) throw new IOException();
				if(i==11) throw new SQLException();
				if(i==13) throw new ArithmeticException();
				if(i==10) throw new ABCException("Abc Excpetrion ");
			}
		}
}
public class Excep2 {
	public static void main(String[] args) {
		
		try
		{
			B2 a = new B2();a.display();
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			
			try
			{	
			}
			finally
			{
			}
		}
		catch (NullPointerException np) {
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			
			try
			{	
			}
			finally
			{
			}
			System.out.println("NullPointerException raisesd ");
		}
		catch (ArithmeticException np) {
			System.out.println("ArithmeticException raisesd ");
		}
		catch (ArrayIndexOutOfBoundsException  anp) {
			System.out.println("ArrayIndexOutOfBoundsException raisesd ");
		}
		catch (IOException  io) {
			System.out.println("IOException raisesd ");
		}
		catch (ABCException  aio) {
			System.out.println("ABCException raisesd ");
		}
		catch (SQLException  isql) {
			System.out.println("SQLException raisesd ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try
			{	
			}
			catch(Exception e)
			{
			}
			
			try
			{	
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
			try
			{	
			}
			finally
			{
			}
			
			System.out.println("Thank you ");
		}
	}
}
class ABCException extends Exception
{
	ABCException(String msg)
	{
		super(msg);
	}
}