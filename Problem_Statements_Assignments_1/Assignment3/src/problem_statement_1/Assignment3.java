package problem_statement_1;
import java.util.Random;
public class Assignment3 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		
		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	Piano[] instrument = null;
			if (randomNum == 1)
	    		instrument[i] = new Piano();
	    	else if (randomNum == 2)
	    		instrument[i] = new Piano();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	
	    	instruments[i].play();
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}

}
