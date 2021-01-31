import java.util.Timer;
import java.util.TimerTask;
public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// And From your main() method or any other method
		
		class SayHello extends TimerTask {
		    public void run() {
		       System.out.println("Hello World!"); 
		    }
		
		}

		 Timer timer = new Timer();
			timer.schedule(new SayHello(), 0, 5000);
		
	}

}
