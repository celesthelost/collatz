package edu.nku.collatz;

public class LongestChain {
	private long limit;
	public LongestChain(long limit)
	{
		this.limit = limit;
	}
	
	public long FindLongestChain()
	{
		long longestChain = 0;
		long maxSize = 0;
		long size = 0; //the size for the current run
		Collatz collatz = new Collatz(1);
		
		for (long i = 2; i <= limit; i++)
		{
			
			collatz.setStartNumber(i);
		    size = 0; //reset the size
		    while (collatz.hasNext())
		    {
		      	collatz.next();
		        size++;
		        
		        if(i == 837799)
		        {
		        	
		        }
		    }
		    
		    if (size > maxSize)
		    {
		        maxSize = size;
		        longestChain = i;
		    }
		}
		return longestChain;
	}
}
