package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumAndIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Enumeration days;
		
		/*Vector daysName = new Vector();
		daysName.add("SUNDAY");
		daysName.add("MONDAY");
		daysName.add("TUESDAY");
		daysName.add("WEDNESDAY");
		daysName.add("THURSDAY");
		daysName.add("FRIDAY");
		daysName.add("SUTARDAY");
		
		days = daysName.elements();
		
		while(days.hasMoreElements())
		{
			System.out.println(days.nextElement());
		}*/
		
		/*String[] num = {"one", "two", "three"};
		Vector aVector = new
		Vector(java.util.Arrays.asList(num));
		//System.out.println();
		System.out.println("Before Vector: " + aVector);
		Iterator nums = aVector.iterator();
		while(nums.hasNext()) {
		String aString = (String)nums.next();
		System.out.println(aString);
		if (aString.length() > 4)
		nums.remove(); }
		System.out.println("After Vector: " + aVector);
		
		Enumeration n;
		 List arrlist = new ArrayList();

	      // populate the list
	      arrlist.add("A");
	      arrlist.add("B");
	      arrlist.add("C");  
	      
	      Enumeration e = Collections.enumeration(arrlist);*/
		
		List lst = new ArrayList();
		lst.add("1");
		lst.add("2");
		lst.add("3");
		
		Iterator itr = lst.iterator();
		while(itr.hasNext())
		{
			String ele = (String)itr.next();
			
			if(ele.equals("2"))
			{
				itr.remove();
				break;
			}
			//System.out.println(ele);
		}

	       
	      
	}

}
