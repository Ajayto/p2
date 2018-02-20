package DailyProgram;

public class StringOpreations {
	
	 static void Op(String str)
	{
		String[] s2=str.split(" ");
		int size=s2.length;
		//String temp=null;
		
		String temp=s2[0];
		String temp2="";

		for(int i=1;i<size;i++)
		{
			if (temp.length()<s2[i].length())
			{
				temp2=temp;
				temp=s2[i];
			}
	}
		System.out.println(temp2);
	}
	 
	 
	 public static void main(String []args){
		 Op("i love my contry india ok gfagdaggad ghshbfbsfhfhsgfhg");
		
	}

}
