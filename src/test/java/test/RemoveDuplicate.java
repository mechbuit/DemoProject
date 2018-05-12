package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr = {"a","aa","bb","a"};
		List<String> str = Arrays.asList(arr);
		System.out.println(str);
		HashSet<String> set = new HashSet<String>();
		
		set.addAll(str);
		/*for(int i=0;i<str.size();i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int count = 1;
				if(str.get(i).equals(str.get(j)))
				{
					if(count>1)
					{
						str.remove(j);
					}
					count++;
				}
				
			}
		}
		System.out.println(str);*/
		System.out.println(set);
	}

}
