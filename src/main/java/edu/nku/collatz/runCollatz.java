package edu.nku.collatz;

public class runCollatz {

	

	public static void main(String [ ] args)
	{
	
	//1
	LongestChain chain= new LongestChain(900000);
		System.out.print(chain.FindLongestChain());
	}
}
