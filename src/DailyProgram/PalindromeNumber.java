package DailyProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          isPalindrom(234565432);

	}
	
	static void isPalindrom(int number)
	{
		int fnumber=number;
	boolean flag;
	String temp;
	String temp2="";
	
	while(number>0)
	{
		temp=Integer.toString(number%10);
		temp2=temp2+temp;
		number=number/10;
		
		
	}
	System.out.println(temp2);
	int revnumber=Integer.valueOf(temp2);
	if(fnumber==revnumber)
	{
		System.out.println("palindrom");
	}
	else
	{
		System.out.println("not palindrom");
	}

	}

}
