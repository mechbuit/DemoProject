package demo;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

/**
 * @author rajeshkumar
 *
 */
public class Test1_BasicFeature {
	
	
	/**
	 *  Check Status Code
	 */
	//@Test
	public void testStatusCode()
	{
		given().
				get("http://services.groupkt.com/country/get/iso2code/us").
		then().
				statusCode(200).log().all();
				
		
		//Assert.assertTrue(true);
	}
	
	
	
	
	Properties prop = new Properties();
	//@BeforeTest
	public void getData() throws IOException
	{
	
	FileInputStream fs = new FileInputStream("E:\\MobileWorkspace\\RestAssured\\data.properties");
	prop.load(fs);
	
	String str = prop.getProperty("HOST");
	System.out.println(str);
	
	}
	
	
	
	@Test
	public void test(){
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		Response res = given().
				param("key","AIzaSyDCtgFd3shUjwiKJ-imTqgyRwU8iHKDmFQ").
				param("location","-33.8670522,151.1957362").
				param("radius","radius").
		when(). 	
				get("maps/api/place/nearbysearch/json").
		then().
				assertThat().statusCode(200).and().
				contentType(ContentType.JSON).
		extract().response();	
		
		String str = res.asString();
		JsonPath js = new JsonPath(str);
		System.out.println(js);
				
	}
	
	
	
	
	
	
	@Test
	public void test1(){
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		get("/price").then().assertThat().body("price", equalTo(12.12));
		get("/price").then().assertThat().body("price", equalTo(12.12f));
		
		given().auth().basic("username", "pwd");
	}
	
	
	
	
	

}
