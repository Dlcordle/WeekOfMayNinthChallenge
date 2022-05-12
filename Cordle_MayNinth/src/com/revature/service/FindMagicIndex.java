package com.revature.service;

import java.util.Arrays;
import java.util.LinkedList;

public class FindMagicIndex 
{
	/*
	 * Code for when the given array contains only distinct values.
	 * If the index grows larger than the values contained inside it
	 * then it will no longer be able to be a magic number due to it's
	 * sorted nature.
	 */
	public static LinkedList<Integer> DistinctValuesFindIndex(int[] values)
	{
		LinkedList<Integer> magicNums = new LinkedList<>();
		
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] >= i)
			{
				break;
			}
			else if(values[i] == i)
			{
				magicNums.add(i);
			}
		}
		
		return magicNums;
	}
	
	/*
	 * The logic is nearly identical for an array containing non-unique values.
	 * Due to the fact that it's still a sorted array it still maintains the same
	 * sequential order however it is no longer possible to exit the loop 
	 * as it becomes possible for A[i] to equal i due to the presence of repeat values.
	 * Therefore the code will always run with a complexity equal to the length of the array.
	 */
	public static LinkedList<Integer> RepeatValuesFindIndex(int[] values)
	{
		Integer result = null;
		
		LinkedList<Integer> magicNums = new LinkedList<>();
		
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] == i)
			{
				magicNums.add(i);
			}
		}
		
		return magicNums;
	}
	
	
	public static Integer FindOneMagicIndex(int[] values, boolean containsDuplicates)
	{
		if(containsDuplicates)
		{
			return FindOneIndexDuplicatesPresent(values);
		}
		else
		{
			return FindOneMagicIndexNoDuplicates(values, 0, values.length);
		}
	}
	
	private static Integer FindOneIndexDuplicatesPresent(int[] values)
	{
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] == i)
			{
				return i;
			}
		}
		
		return null;
	}
	
	/*
	 * Finds ONE magic number and if multiple are present then 
	 */
	private static Integer FindOneMagicIndexNoDuplicates(int[] values, int start, int end)
	{
		Integer mid = (start+end)/2;
		
		if(values[mid] == mid)
		{
			return mid;
		}
		else if(end-start <= 1)
		{
			return null;
		}
		else if(mid < values[mid])
		{
			return FindOneMagicIndexNoDuplicates(values, start, mid);
		}
		else if(mid > values[mid])
		{
			return FindOneMagicIndexNoDuplicates(values, mid, end);
		}
		
		return null;
	}
}
