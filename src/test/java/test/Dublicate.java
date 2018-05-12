package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		
		/*for(int i=0;i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j])&&(i!=j))
				{
					System.out.println("Dublidate are "+strArray[j]);
					
				}
			}
		}*/
		
		/*HashSet<String> set = new HashSet<String>();
		for(String st: strArray)
		{
		{
		if(!set.add(st))
		{
			System.out.println("Dublidate are "+st);
		}
		}
		}*/
		
		String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(array));

	}

}
