/**
 * 
 * @author jgonsalves21
 * TallyCounterTest
 *
 */
public class TallyCounterTest {

	public static void main(String[] args) 
	{
		
		TallyCounter counter = new TallyCounter();
		counter.click();
		System.out.println(counter.getCount());
		
		counter.reset();
		System.out.println(counter.getCount());
		
		TallyCounter counter2 = new TallyCounter(5);
		counter2.click();
		System.out.println(counter2.getCount());
		
		counter2.unclick();
		System.out.println(counter2.getCount());
		
	}

	
	
}
