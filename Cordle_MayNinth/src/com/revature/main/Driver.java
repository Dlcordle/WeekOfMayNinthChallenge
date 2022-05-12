package com.revature.main;

import java.util.ArrayList;
import com.revature.service.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		System.out.println("=====================Magic Index====================");
		int[] testMagicIndexTwo = {1, 1, 1, 1, 1, 1, 1, 1, 1};

		System.out.println("FindOneMagicIndex test 1: " + FindMagicIndex.FindOneMagicIndex(testMagicIndexTwo, true));
		
		System.out.println("======================Power Set=====================");
		ArrayList<Integer> tester = new ArrayList<>();
		
		tester.add(1);
		tester.add(2);
		tester.add(3);
		
		PowerSet.findAllSubsets(tester);
		
		System.out.println("=================Recursive Multiple=================");
		System.out.println("10 x 4 = "+ RecursiveMultiply.recursiveMultiply(10, 4));
	}

}
