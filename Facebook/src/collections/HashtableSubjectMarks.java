package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableSubjectMarks {

	public static void main(String[] args) {
		//Key,Value
	Hashtable<String,Integer> student_1=new Hashtable<String,Integer>();
//Key->Subject
//Value->Marks

student_1.put("Math",80);
student_1.put("Science", 81);
student_1.put("History",80);
student_1.put("Testing", 40);

int mark=student_1.get("Math");
System.out.println("Maths ke marks: "+mark);
System.out.println("---------");

//Retrival using loop
for(Map.Entry<String, Integer> e: student_1.entrySet())
{
	System.out.println("Key="+e.getKey()+" Value="+e.getValue());
}

student_1.remove("Testing");//Do we always remove on the basis of Key 
System.out.println("-----------");
for(Map.Entry<String, Integer> e: student_1.entrySet())
{
	System.out.println("Key="+e.getKey()+" Value="+e.getValue());
}

//Updation 
student_1.put("History", 46);
student_1.put("Science", 88);

System.out.println("-----------");
for(Map.Entry<String, Integer> e: student_1.entrySet())
{
	System.out.println("Key="+e.getKey()+" Value="+e.getValue());
}

	}

}
