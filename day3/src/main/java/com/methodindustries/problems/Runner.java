package com.methodindustries.problems;


//Given an array of integers nums and an integer target, return indices of the
//two numbers such that they add up to target. You may assume that each input
//is sorted in numerical order and has exactly one solution. You may not use the
//same element twice. You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [2,3,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]





public class Runner {
	public static void main(String args[]) {

 		int[] nums= {3,3};
 		int target=6;
 		
 		int Indexresults[]= (TwoSum.run(nums,target));
 		
		
	}

}
