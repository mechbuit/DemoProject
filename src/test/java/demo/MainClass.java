package demo;


class ClassA
{
	void show()
	{
		System.out.println("A");
	}
}
class ClassB extends ClassA
{
	void show()
	{
		System.out.println("B");
	}
}
class ClassC extends ClassB
{
	void show()
	{
		System.out.println("C");
	}
	void show1()
	{
		System.out.println("D");
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
