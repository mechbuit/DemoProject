package test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {1,0,1,0,0,0,1,1,0,0,0,};
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		//System.out.println(count);
		for(int i=0;i<count;i++)
		{
			arr[i]=1;
		}
		for(int i=count;i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
