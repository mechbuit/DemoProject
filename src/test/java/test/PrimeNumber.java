package test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 20;
		int r;
		boolean temp = false;
		
		for(int i=2;i<n/2;i++)
		{
			r = n%i;
			if(r!=0)
			{
				temp=true;
			}
			else{
				
				break;
			}
		}
		if(temp==true)
		{
			System.out.println("prime number");
		}

	}

}
