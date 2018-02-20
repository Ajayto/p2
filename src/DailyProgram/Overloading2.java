package DailyProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.bcel.generic.NEW;
import org.apache.bcel.generic.NEWARRAY;

public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> Al=new ArrayList<Object>();
		//test(Al);
		test t=new test();
		t.test("");

	}
	

}

class test
{
	public static void test(Object obj)
	{
		System.out.println("test is object class method");
	}
	public static void test(String obj)
	{
		System.out.println("test is String class method");	
	}
	public static void test(ArrayList<String> str)
	{
		System.out.println("test is arraylist class method");
	}
	
	public static void test(test obj)
	{
		System.out.println("test is class class method");	
	}
}
