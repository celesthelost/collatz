package edu.nku.collatz;
import java.util.Iterator;


public class Collatz implements Iterator<Double>{

	private double startNumber;
	
	private double currentNumber;
	
	public Collatz(double startNumber)
	{
	setStartNumber(startNumber);
	}
	
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentNumber > 1;
	}

	public Double next() {
		
		if(currentNumber % 2 ==0)
		{
			return currentNumber = currentNumber / 2;
		}
		else
		{
			return currentNumber = 3 * currentNumber +1;
		}
	}


	public double getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(double startNumber) {
		this.startNumber = startNumber;
		this.currentNumber= this.startNumber;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
