package com.revature.service;

public class RecursiveMultiply 
{
	public static int recursiveMultiply(int a, int b)
	{
		if(b == 0)
		{
			return 0;
		}
		
		return a + recursiveMultiply(a, b-1);
	}
}
