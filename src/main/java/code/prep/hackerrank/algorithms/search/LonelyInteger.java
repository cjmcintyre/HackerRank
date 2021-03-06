package code.prep.hackerrank.algorithms.search;

import java.util.HashMap;
import java.util.Scanner;
/**
 * Problem Statement
 * There are N integers in an array A. All but one integer occur in pairs. 
 * Your task is to find out the number that occurs only once.
 * 
 * Input Format
 * The first line of the input contains an integer N indicating number of integers.
 * The next line contains N space separated integers that form the array A.
 * 
 * Constraints
 * 1 <= N < 100 
 * N % 2 = 1 ( N is an odd number ) 
 * 0 <= A[i] <= 100, ∀ i ∈ [1, N]
 * 
 * Output Format
 * Output S, the number that occurs only once.
 *
 * Sample Input 1:
 * 1
 * 1
 * 
 * Sample Output 1:
 * 1
 * 
 * Sample Input 2:
 * 3
 * 1 1 2
 * 
 * Sample Output 2:
 * 2
 */


public class LonelyInteger 
{
	
	private static void find(int[] ls)
	{
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < ls.length; ++i)
		{
			int key = ls[i];
			if (hash.containsKey(key))
			{
				int value = hash.get(key);
				hash.put(key, ++value);
			}
			else
			{
				hash.put(key, 1);
			}
		}
		
		for (int key : hash.keySet())
		{
			if (hash.get(key) == 1)
			{
				System.out.println(key);
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int 	n 		= scanner.nextInt();
		int[]	ls		= new int[n];
		
		for (int i = 0; i < n; ++i)
		{
			ls[i] = scanner.nextInt();
		}
		
		find(ls);
		scanner.close();
	}
}
