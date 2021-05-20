package capitalOne;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		ReflectionTest test = new ReflectionTest();
//creating class object from the object using the getclass method
		Class cls = test.getClass();
		System.out.println("The Name of the Class is " + cls.getName());
		System.out.println("The Public Methods are : ");

		// getting methods of the class via getMethods
		Method[] methods = cls.getMethods();

		// print method names
		for (Method method : methods)
			System.out.println(method.getName());
		
		// creates object of desired method by providing the method name and parameter
		// class as arguments to the getDeclaredMethod
		Method methodcall1 = cls.getDeclaredMethod("method2",int.class);
		
		// invokes the method at runtime 
        methodcall1.invoke(test, 21);
        
        //creates the object of the desired field by 
        //providing the name of field as arument to the getDeclaredField method
        Field field = cls.getDeclaredField("s");
   
        //allows object to access the field irrespective of access specifier
        field.setAccessible(true);
        
        //takes object and new value to be assigned as args
        field.set(test, "JAVA");
        
        //creates object of desired method by providing the method name as an argument to getDeclaredMethod
        Method methodcall2=cls.getDeclaredMethod("method1");
        
        //invokes at runtime
        methodcall2.invoke(test);
        
        //creates object of desired method by providing the method name as an argument to getDeclaredMethod
        Method methodcall3 = cls.getDeclaredMethod("method3");
        
        // allows the object to access the method irrespective  
        // of the access specifier used with the method 
        methodcall3.setAccessible(true); 
  
        // invokes the method at runtime 
        methodcall3.invoke(test); 
        
	}



}
