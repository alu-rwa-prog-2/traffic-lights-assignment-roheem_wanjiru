import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class W3A3Q1 {

//	Instructions: Java program to simulate traffic and traffic lights
//	cars can go for green and yellow, they can't go for red
//	when cars come, add them to your collection
//	cars are generated and added randomly to your queue
//	stop when cars equal 100
//	1 second = 1000 milliseconds
//	yellow light (10s), green(30s), red(20s) 
//	one car goes per second when light is green
//	one car goes per 2 seconds when light is yellow
//	red = no car goes
//	the program should end when all the cars in the collection are gone
//	cars added can only be 20 at a time
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
//		create an ArrayList for car collection
		
		ArrayList <Integer> carCollection = new ArrayList <Integer> ();

//		for loop to add 30 cars to the collection for the initial car collection
		
		for (int i = 0; i<31; i ++)
		  carCollection.add(i);
		  System.out.println(carCollection);
		
//		initialising the traffic lights, as strings 
		
		String greenLight = "The light is now green, you can now go!"; //this runs for 30s
		String yellowLight = "The light is now yellow, you can still go, but do it quickly!"; //this runs for 10s
		String redLight = "The light is now red, you can not go!"; //this runs for 20s
		
	
//		timer classes to delay the lights and give a light sequence
		
//	    timer for the green light (lasts 30 seconds, 1 car/s)
		
		class GreenLight extends TimerTask {
		    public void run() {
		    	for (int i = 0; i<31; i ++)
		  		  carCollection.add(i++);
		  		  System.out.println(carCollection);
		  		  
		    	 System.out.println(greenLight);
				 carCollection.subList(0, 20).clear();
				 System.out.println(carCollection);
		    }
		}
		
		    Timer timer1 = new Timer();
		    timer1.schedule(new GreenLight(), 0, 30000);
		    
//	    timer for the yellow light (lasts 10 seconds, 1 car/2s)	
		    class YellowLight extends TimerTask {
			    public void run() {
//			    	for (int i = 30; i<41; i ++)
//			  		  carCollection.add(i);
//			  		  System.out.println(carCollection);
			  		  
			    	System.out.println(yellowLight);
					   carCollection.subList(0, 10).clear();
					   System.out.println(carCollection);
			    }
			}
			
			    Timer timer2 = new Timer();
			    timer2.schedule(new YellowLight(), 0, 10000);
	
//			    timer for the red light (lasts 20 seconds, no cars)	
			    class RedLight extends TimerTask {
				    public void run() {
//				    	for (int i = 40; i<71; i ++)
//				  		  carCollection.add(i);
//				  		  System.out.println(carCollection);
				  		  
				    	System.out.println(redLight);
						System.out.println(carCollection);
				    }
				}
				
				    Timer timer3 = new Timer();
				    timer3.schedule(new RedLight(), 0, 20000);
			    
//		while loop to remove cars/second
//		
//       while (lightStatus == greenLight) {
//	
//		   System.out.println(greenLight);
//		   carCollection.subList(0, 20).clear();
//		   System.out.println(carCollection);
//		   break;
//       }
//
//       while (lightStatus == yellowLight) {
//    		
//		   System.out.println(yellowLight);
//		   carCollection.subList(0, 10).clear();
//		   System.out.println(carCollection);
//		   break;
//       }
//       
//       while (lightStatus == redLight) {
//    		
//		   System.out.println(redLight);
//		   System.out.println(carCollection);
//		   break;
//       }


 
}
}