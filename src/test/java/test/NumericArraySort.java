package test;

import java.util.Arrays;

public class NumericArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,9,1,7,8,10,6,2};
		/*Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		int swap;
		  for(int i=0;i<a.length-1;i++){
		   for(int j=0;j<a.length-1-i;j++){
		    if(a[j]>a[j+1]){
		     swap=a[j];
		     a[j]=a[j+1];
		     a[j+1]=swap;
		    }
		   } 
		  }
		System.out.println(Arrays.toString(a));
	}
}
