package com.revature.service;

import java.util.ArrayList;
import java.util.LinkedList;

public class PowerSet 
{
	public static void findAllSubsets(ArrayList<?> fullSet)
	{
		int[] binaryValues = new int[fullSet.size()];
		
		ArrayList<ArrayList<?>> result = new ArrayList<>();
		
		for(int i = 0; i < fullSet.size(); i++)
		{
			binaryValues[i] = 0;
		}
		
		for(int c = 0; c < Math.pow(2, fullSet.size()); c++)
		{
			//ArrayList<?> fresh = new ArrayList<>();
			
			System.out.print("[");
			
			for(int a = 0; a < binaryValues.length; a++) 
			{
				if(binaryValues[a] == 1)
				{
					System.out.print(fullSet.get(a) + " ");
				}
			}
			
			binaryValues = binaryIncrement(binaryValues);
			
			System.out.println("]");
		}
	}
	
	private static int[] binaryIncrement(int[] binaryNum)
	{
		for(int i = binaryNum.length-1; i >= 0; i--)
		{
			if(binaryNum[i] == 0)
			{
				binaryNum[i] = 1;
				break;
			}
			else
			{
				binaryNum[i] = 0;
			}
		}
		
		return binaryNum;
	}
}
