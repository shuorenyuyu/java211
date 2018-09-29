package hw5;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class hw7_demo {
	public static void main(String[] args){
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(13);
		list1.add(8);
		list1.add(18);
		list1.add(9);
		list1.add(10);
		
		List<Integer> list2 = new ArrayList();
		list2.add(9);
		list2.add(8);
		list2.add(22);
		list2.add(43);
		
		System.out.println("in the linked list are "+list1);
		System.out.println("in the list are "+list2);
		list1.addAll(3,list2);
		 
		System.out.println("after list2 add in list1 starting from third one"+list1);
		
		boolean bool= list1.containsAll(list2);
		System.out.println(bool);
		
		int index=list1.lastIndexOf(8);
		System.out.println("the last index of given object in the linked list is"+index);
		
		
		
		list1.removeAll(list2);
		System.out.println("after remove"+list1);
		System.out.println(list2);
		
	}
}
