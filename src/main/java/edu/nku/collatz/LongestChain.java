package edu.nku.collatz;

public class LongestChain {
	private double limit;
	public LongestChain(double limit)
	{
		this.limit = limit;
	}
	
	public double FindLongestChain()
	{
		double longestChain = 0;
		double maxSize = 0;
		double size = 0;//the size for the current run
    Collatz collatz = new Collatz(1);
    
    for (double i = 2; i <= limit; i++)
    {
    	
    	collatz.setStartNumber(i);
        size = 0;//reset the size
        while (collatz.hasNext())
        {

          	collatz.next();
            size++;
            if(i ==837799)
            {
            	
            }
        }
        if (size > maxSize){
            maxSize = size;
            longestChain = i;
        }
    }
    return longestChain;
	}
	
	
}
