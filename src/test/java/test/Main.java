package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gson gson = new Gson();
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.json"));
			POJO pj = gson.fromJson(br, POJO.class);
			if(pj!=null)
			{
				for(Todo td : pj.getTodo())
				{
					System.out.println(td.getId() + "  " + td.getTitle() +"  " +td.getCompleted());
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
