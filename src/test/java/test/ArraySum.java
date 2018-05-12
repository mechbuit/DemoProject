package test;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,5,24,9,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);

	}

}
