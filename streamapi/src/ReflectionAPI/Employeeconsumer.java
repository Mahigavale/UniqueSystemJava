package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Employeeconsumer {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		
		
		 Class<?>  c= Class.forName("ReflectionAPI.Employee");
		 
		 
		 Constructor<?>[] constructors=c.getDeclaredConstructors();
		 
		 Object obj=c.getConstructor().newInstance(); // new Employee()0;
		 Object ob2=c.getConstructor().newInstance();
		 // c.getConstructors()=>returns  only the  Public Constructors.
		                               
		 
		 for(Constructor d:constructors)
		 {
			 System.out.println(d.getName());
			 System.out.println(d.getParameterCount());
			 System.out.println(d);
			 
			 Parameter[] p=d.getParameters();
			 
			 
			 System.out.println("Params:");
			 for(Parameter pm:p)
			 {
				
				 System.out.println(pm.getName());
				 System.out.println(pm.getModifiers());
				 System.out.println(pm.getType());
				 
				
			 }
			 System.out.println("********************************");
		 }

		 
		 System.out.println("*****************!!!! FIELDS!!!!!***************");
		 
		 
		 Field[] fields=c.getDeclaredFields();
		 //c.getFields();
		 for(Field f:fields)
		 {
			  System.out.println(f);
			 
		 }
		 
		  Field salary_field=c.getDeclaredField("salary");
		  salary_field.setAccessible(true);
		  
		  salary_field.set(obj, 3232.35);
		  System.out.println(salary_field.get(obj));
		  
		  
		  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!******METHODS******!!!!!!!!!!!!!!!!!!");
		  
		  
		  Method[] methods=c.getDeclaredMethods();
		  
		 for(Method met:methods)
		 {
			 System.out.println(met);
		 }
		 
		 System.out.println("Invoking the secure method.... from outside the class...");
		 Method secure_demo=c.getDeclaredMethod("securemethod",int.class, int.class);
		  secure_demo.setAccessible(true);
		 secure_demo.invoke(obj,100,10);
	}

}
