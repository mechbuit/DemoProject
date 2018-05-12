package test;

public class Pallindrome {

	public static void main(String[] args) {
		String str = "NITINITIN";
		boolean isPal;
		
		isPal = checkPallindrome(str);
		System.out.println(isPal);

	}

	public static boolean checkPallindrome(String str)
	{
		Boolean isPalindrome;
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			isPalindrome = true;
		}
		else
		{
			isPalindrome = false;
		}
		return isPalindrome;
	}

}
