package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		//Key,Value
HashMap<Integer,String> map=new HashMap<Integer,String>();

//Addition
map.put(12,"Velocity");
map.put(null, "Testing");
map.put(78,"Class");
map.put(1,null);
map.put(2,null);
map.put(3,"2024");

//Retrival
String x=map.get(12);
System.out.println(x);

System.out.println("==============");

//Retrival using loop
for(Map.Entry<Integer,String> e: map.entrySet())
{
	System.out.println("Key= "+e.getKey()+ " Value= "+e.getValue());
}

//Deletion
//map.remove(34);

//Key-unique i.e. can not be duplicated->Only 1 Null key allowed
//Value-can be duplicated				->Any no of Null values allowed


map.put(21, "Mumbai");//new pair added
map.put(null,"Class");//value replace
map.put(55, "Pune");//new pair added

map.put(78, "Batch");
map.put(79, "Batch");

System.out.println("===========");
for(Map.Entry<Integer,String> e: map.entrySet())
{
	System.out.println("Key= "+e.getKey()+ " Value= "+e.getValue());
}
//Deletion
map.remove(3,"2024");
//System.out.println("===================");
//for(Map.Entry<Integer,String> e: map.entrySet())
//{
//	System.out.println("Key= "+e.getKey()+ " Value= "+e.getValue());
//}

System.out.println("++++++");
//Retrieve the value for key 78
String value = map.get(55);

// Print the value
System.out.println(value);



	}

}
