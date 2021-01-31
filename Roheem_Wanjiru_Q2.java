import java.util.HashMap;
public class W3A3Q2 {

//	Write a Java program to copy all of the mappings from the specified map to another map.
//	Test it with three different maps.

//	Author: Wanjiru Wang'ondu & Adio Roheem
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	create a HashMap with 7 elements, with the colours of the rainbow ROYGBIV
		
		HashMap <Integer, String> colourList = new HashMap <Integer, String>();
		
		colourList.put(1,"Red");
		colourList.put(2, "Orange");
		colourList.put(3, "Yellow");
		colourList.put(4, "Green");
		colourList.put(5, "Blue");
		colourList.put(6, "Indigo");
		colourList.put(7, "Violet");
		
		System.out.println("Initial colour list: " + colourList);
		
		
//		copying the mappings from colourList to another HashMap
//		create another HashMap and copy all the contents of colourList into colourList2 using the
//		putAll method
		
		HashMap <Integer, String> colourList2 = new HashMap <Integer, String>();
		colourList2.putAll(colourList);
		
		System.out.println("Initial copied colour list: " + colourList2);
		
		
//		Test1: copying it into colourTestList1
		
		HashMap <Integer, String> colourTestList1 = new HashMap <Integer, String>();
		colourTestList1.putAll(colourList);
		
		System.out.println("Colour Test List 1: " + colourTestList1);
		
//		Test2: copying it into colourTestList2
		
		HashMap <Integer, String> colourTestList2 = new HashMap <Integer, String>();
		colourTestList2.putAll(colourList);
		
		System.out.println("Colour Test List 2: " + colourTestList2);
		
//		Test3: copying it into colourTestList3
		
		HashMap <Integer, String> colourTestList3 = new HashMap <Integer, String>();
		colourTestList3.putAll(colourList);
		
		System.out.println("Colour Test List 3: " + colourTestList3);
		
	}

}
