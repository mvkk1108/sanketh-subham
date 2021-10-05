package conditionalstatments;

public class JumpSatetements {

	public static void main(String[] args) {
		
		// 6 -15 , last prime number
		int prime = -1;
		for(int i = 6; i<=15; i++)
		{
			int count = 0;
			
			for(int j =1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				prime = i;
				//System.out.println(i);
				//break;
			}
		}

		System.out.println(prime);
	}

}
