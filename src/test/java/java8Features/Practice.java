package java8Features;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nu till where prime number required  :  ");
		//int n = sc.nextInt();
		int n=3;
		/*for(int i=1;i<=n;i++)
		{*/
			for(int j=2;j<n/2;j++)
			{
				if(n%j==0)
				{
					System.out.println("prime no is  "+n);
					break;
				}
			}
		//}
		

	}

}
