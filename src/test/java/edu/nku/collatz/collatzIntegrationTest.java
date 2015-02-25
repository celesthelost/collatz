package edu.nku.collatz;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test wrote after code for project was completed non TDD
public class collatzIntegrationTest {
	LongestChain longestChain;
	


	@Test
	public void longestchain1000000() 
	{
		longestChain= new LongestChain(1000000);
		double maxLimit = longestChain.FindLongestChain();
		assertThat(maxLimit, is(equalTo(837799.0)));

	}
	
}


