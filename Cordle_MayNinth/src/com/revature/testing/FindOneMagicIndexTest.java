package com.revature.testing;

import static org.junit.Assert.*;

import org.junit.Assert;

import com.revature.service.*;

import org.junit.Test;

public class FindOneMagicIndexTest 
{

	@Test
	public void passCaseNoDuplicates() 
	{
		int[] testVals = {0,2,3,4,5};
		
		int result = FindMagicIndex.FindOneMagicIndex(testVals, false);
		
		assertEquals(0, result);
	}
	
	@Test
	public void failCaseNoDuplicates()
	{
		int[] testVals = {1, 2, 3, 4, 5, 6, 7};
		
		assertEquals(null, FindMagicIndex.FindOneMagicIndex(testVals, false));
	}
	
	@Test
	public void passCaseDuplicates()
	{
		int[] testVals = {1, 1, 1, 1, 1, 1, 1};
		
		int result = FindMagicIndex.FindOneMagicIndex(testVals, true);
		
		assertEquals(1, result);
	}
	
	@Test
	public void failCaseDuplicates()
	{
		int[] testVals = {1, 200, 200, 200};
		
		assertEquals(null, FindMagicIndex.FindOneMagicIndex(testVals, true));
	}

}
