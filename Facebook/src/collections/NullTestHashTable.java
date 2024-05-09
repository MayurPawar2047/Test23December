package collections;

import java.util.Hashtable;

public class NullTestHashTable {

	public static void main(String[] args) {
		
		System.out.println("Start");
		//Key,Value
		Hashtable<String,Integer> student_1=new Hashtable<String,Integer>();
	//Key->Subject
	//Value->Marks
		student_1.put("Math",80);
		student_1.put("Science", 81);
		student_1.put(null,80);
		student_1.put("Testing", 40);
		student_1.put("OS", null);
		
		int mark=student_1.get("Math");
		System.out.println(mark);
		System.out.println("--------");

	}

}
