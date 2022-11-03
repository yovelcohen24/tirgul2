import java.util.ArrayList;


/** class description of shared
 * data: getters and setters
 * for the ShareData class. On
 * this class we will get the
 * result of our threads for
 * the array
 * @author yovel cohen
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 * SharedData constructor
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return the array that got the answer
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/**
	 * @param winArray 
	 * set WinArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param winFlag
	 * set flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
