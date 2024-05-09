package collections;

import java.util.Hashtable;

public class HashTableWithoutGeneric {
	public static void main(String[] args) {
		System.out.println("Start");
		
Hashtable student_1=new Hashtable();
			
student_1.put("Username","velocity.com");
student_1.put("Password",13456);
student_1.put(23,'$');
student_1.put(true,40.76);

//Retrival using loop
for(Object e:student_1.entrySet())
{
	System.out.println(e);
}

System.out.println("----------");

//Object all 
Object x=student_1.get("Username");
System.out.println(x);

	}

}
