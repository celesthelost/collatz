package edu.nku.collatz;
import java.util.Iterator;


public class Collatz implements Iterator<Long>{

	private long startNumber;
	
	private long currentNumber;
	
	public Collatz(long startNumber)
	{
		setStartNumber(startNumber);
	}
	
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentNumber > 1;
	}

	public Long next() {
		
		if(currentNumber % 2 ==0)
		{
			return currentNumber = currentNumber / 2;
		}
		else
		{
			return currentNumber = 3 * currentNumber +1;
		}
	}


	public long getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(long startNumber) {
		this.startNumber = startNumber;
		this.currentNumber= this.startNumber;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
