package singleton;

public class ClassA {
	
	private static ClassA A = new ClassA();
	
	private ClassA() {}
	
	public static ClassA getInstance(){
		return A;
	}
	
	public void display(){
		System.out.println("Class A Display");
	}

}
