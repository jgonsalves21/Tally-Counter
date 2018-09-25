/**
 * 
 * @author jgonsalves21
 * TallyCounter
 *
 */

public class TallyCounter 
{

	//fields
	private int count;
	
	//constructors
	public TallyCounter()
	{
		count = 0;
	}
	
	public TallyCounter(int a) 
	{
		count = a;
	}
	
	//methods
	public void click()
	{
		count ++;  //The same as count = count +1
		//Another option count += 1
	}
	
	public int getCount() 
	{
		return count;
	}
	
	public void reset() 
	{
		count = 0;
	}

	public void unclick() 
	{
		count --;
	}

}
