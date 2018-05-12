package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbcccddefa";
		StringBuilder sbr =new StringBuilder(str);
		int count =1;
		for(int i=0;i<sbr.length();i++)
		{
			if(i<sbr.length()-1&&sbr.charAt(i)==sbr.charAt(i+1))
			{
				sbr.deleteCharAt(i);
				count++;
				i--;
			}
			else
			{
				if(count>1)
				{
					sbr.insert(i+1, count);
				}
				count=1;
				i++;
			}

		}
		System.out.println(sbr.toString());



	}

}
