package com.company;
import java.util.HashMap;


public class Wanji_AdioQuestion2 {



		public static void main(String[] args) {




			HashMap<String, String> First = new HashMap<>();
			First.put("Name", " Adedeji");
			First.put("Age", "18");
			First.put("School", "African Leadership University");
			First.put("Course", "Computer Science");
			First.put("Year", "Second Year");
			System.out.println(First);







        HashMap<String, String> Second = new HashMap<>();
		Second.put("Name", " Aderinsola");
		Second.put("Age", "17");
		Second.put("School", "African Leadership University");
		Second.put("Course", "International Business and Trade");
		Second.put("Year", " First Year");
		System.out.println(Second);


		HashMap<String, String> Third = new HashMap<>();
		Third.put("Name", "Kehinde");
		Third.put("Age", " 18");
		Third.put("School", "African Leadership University");
		Third.put("Course", "Global Challenges");
		Third.put("Year", " Second Year");
		System.out.println(Third);


			HashMap<String,String> Joint=new HashMap<>();
			Joint.putAll(First);
			Joint.putAll(Second);
			Joint.putAll(Third);
			System.out.println(Joint);





		}
	}




