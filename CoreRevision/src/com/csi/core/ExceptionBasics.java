package com.csi.core;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

class Dept
{
	void get(String deptName) throws ParseException
	{
		
	}
}
class Emp extends Dept
{
	void get(String deptName) throws NullPointerException, ArithmeticException
	{
		
	}
}
public class ExceptionBasics {
	public static void main(String[] args) throws ArithmeticException {

		try
		{
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	static void ageInvalid(int age) throws NullPointerException, ArrayIndexOutOfBoundsException
	{
		
		if(age<18)
		{
			try {
				throw new RecordNotFoundException("Invalid Age");
			} catch (RecordNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
