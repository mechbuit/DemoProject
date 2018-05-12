package test;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,9,2,7,10};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
		

	}

}
