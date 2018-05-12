package java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			int i = (Integer) itr.next();
			//System.out.println(i);
		}
		//list.stream().forEach(System.out::println);
		//list.forEach(System.out::println);
		//list.forEach(System.out.println);
		
		list.forEach(System.out::println);
		
	}

}
