package test;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			/*String str = "sfrgrvcgnghggv";
			System.out.println(str.charAt(6));
			System.out.println(Character.toString(str.charAt(6)));
			System.out.println(str.codePointAt(3));
			System.out.println(str.codePointBefore(3));*/

			/*String str1 = "poinh", str2 = "point";
			System.out.println(str1.contains("ih"));
			System.out.println(str1.valueOf(3));*/


			//String str = "java";
			/*System.out.println(str.indexOf("v"));
			System.out.println(str.indexOf("Java"));
			System.out.println(str.indexOf("a", 2));
			System.out.println(str.indexOf("a", 1));*/
			//System.out.println(str.isEmpty());

			/*char[] ch = str.toCharArray();

			String.valueOf(ch);
			 */

			//System.out.println(str.replace("a", "e"));




			String []votes = {"john", "johnny", "jackie", 
					"johnny", "john", "jackie", 
					"jamie", "jamie", "john",
					"johnny", "jamie", "johnny", 
			"john"};	

			HashMap<String, Integer> map = new HashMap<String,Integer>();
			
			for(String str: votes)
			{
				if(map.containsKey(str))
				{	
					map.put(str, map.get(str)+1);
					
				}
				else
				{
					map.put(str,1);
					
				}
			}
			System.out.println(map);
			
			




























		}
		catch(Exception e)
		{
			System.out.println("Excetion occured");
		}
	}

}
