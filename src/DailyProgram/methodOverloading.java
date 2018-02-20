package DailyProgram;

public class methodOverloading {
	final public static void  main(String...args)
	{
		D d =new D();
		d.call();
		//c.get(this);
	}
	
}

class D
{
	void call()
	{
		C c =new C();
		A a=new A();
		B b=new B();
		A ab=new B();
		c.get(a);
		c.get(b);
		c.get(ab);
		c.get(null);
		
	}
	
}


class A
{
void get(A a)
{
	System.out.println("Class A method");
}
}
class B extends A
{
	void get(B b)
	{
		System.out.println("Class B");
	}

}
 class C
 {
	void get(A  a)
	 {
			System.out.println("Class A");
		}
	
	void get(B  b)
	 {
			System.out.println("Class B");
		}
 }

 


