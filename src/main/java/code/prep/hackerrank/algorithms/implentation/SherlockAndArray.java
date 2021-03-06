package code.prep.hackerrank.algorithms.implentation;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Problem Statement
 * Watson gives an array A1,A2...AN to Sherlock. Then he asks him to find if there
 * exists an element in the array, such that, the sum of elements on its left is 
 * equal to the sum of elements on its right. If there are no elements to left/right, 
 * then sum is considered to be zero.
 * Formally, find an i, such that, A1+A2...Ai-1 = Ai+1+Ai+2...AN.
 * 
 * Input Format 
 * The first line contains T, the number of test cases. For each test case, the first 
 * line contains N, the number of elements in the array A. The second line for each 
 * testcase contains N space separated integers, denoting the array A.
 * 
 * Output Format
 * For each test case, print YES if there exists an element in the array, such that, 
 * the sum of elements on its left is equal to the sum of elements on its right, else 
 * print NO.
 * 
 * Constraints 
 * 1 ≤ T ≤ 10 
 * 1 ≤ N ≤ 105 
 * 1 ≤ Ai ≤ 2*104 for 1 ≤ i ≤ N
 * 
 * Sample Input
 * 2
 * 3
 * 1 2 3
 * 4
 * 1 2 3 3
 * 
 * Sample Output
 * NO
 * YES
 *
 */

public class SherlockAndArray 
{
	
	private static int leftSum(ArrayList<Integer> ls, int i)
	{
		int sum = 0;
		
		for (int j = i - 1; j > -1; --j)
		{
			sum += ls.get(j);
		}
		
		return sum;
	}
	
	private static int rightSum(ArrayList<Integer> ls, int i)
	{
		int sum = 0;
		
		for (int j = i + 1; j < ls.size(); ++j)
		{
			sum += ls.get(j);
		}
		
		return sum;
	}
	private static void indexExist(ArrayList<Integer> ls)
	{
		String exist = "NO";
		
		for (int i = 0; i < ls.size(); ++i)
		{
			if (leftSum(ls, i) == rightSum(ls, i))
			{
				exist = "YES";
				break;
			}
		}
		
		System.out.println(exist);
	}
	
	public static void main(String[] args)
	{
		int     t, n;
		Scanner scanner = new Scanner(System.in);
		
		t = scanner.nextInt();
		while (t > 0)
		{
			n = scanner.nextInt();
			ArrayList<Integer> ls = new ArrayList<Integer>();
			
			for (int i = 0; i < n; ++i)
			{
				ls.add(scanner.nextInt());
			}

			indexExist(ls);
			--t;
		}
		
		scanner.close();
	}

}
