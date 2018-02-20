package DailyProgram;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findFibonacciSeries(10);
		boolean flag=isPrimeNumber(-8);
		if(flag==true)
		{
			System.out.println("number is prime" );
		}

		else 
		{
			System.out.println("number is not prime");
		}
		
		
		for(int i=0;i<=10;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i +" is prime number");
			}
			else 
			{
				System.out.println(i +" is not prime number");
			}
		}
	}
	
	static void findFibonacciSeries(int number)
	{
		int n;
		 int x=0;
		 int y=1;
		System.out.print(x+", "+y);
		for(int i=2;i<number;i++)
		{
			n=x+y;
			System.out.print(", "+n);
			x=y;
			y=n;
			
		}
	}
	
	static boolean isPrimeNumber(int number)
	{
		boolean flag=true;
		if(number<=0 || number==1)
		{
			System.out.println("given number is not applicable for check plase please number above 2");
			return false;
		}
		else
		{
		
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}
		
	}	

}
