package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//Insertion,Deletion,Retrival
		ArrayList<Integer> a=new ArrayList<Integer>();
		//List<Integer> b=new ArrayList<Integer>();
		
		//Insertion
		a.add(22); //0
		a.add(34); //1
		a.add(56); //2
		a.add(98); //3
		a.add(90); //4
		
		int size=a.size();
		
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("==================");
		
		//Deletion
		//a.remove(2);
		a.remove(3);
		a.remove(3);
		
		size=a.size();
		for(int i=0;i<size;i++)
		{               //Retrival
			System.out.println(a.get(i));
		}
	}
}
