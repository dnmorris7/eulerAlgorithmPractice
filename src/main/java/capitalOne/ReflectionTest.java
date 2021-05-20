package capitalOne;
import java.lang.reflect.*;

public class ReflectionTest {

	//create a private field
	private String s;
	
	// create public constructor
	public ReflectionTest() {
		
		s="David is a nerd.";
		
	}

	//create no-method argument
	public void method1() {
		System.out.println("The String is "+s);
		
	}
	//create int argument method
	public void method2(int n) {
		System.out.println("The number is "+ n);
	}
	
	//create private method
	private void method3() {
		System.out.println("Private Method Invoked");
	}
	
}
