package code.prep.hackerrank.algorithms.implentation;

import java.util.Scanner;

/**
 * Problem Statement
 * Watson gives to Sherlock an array: A1,A2,⋯,AN. He also gives to Sherlock two other 
 * arrays: B1,B2,⋯,BM and C1,C2,⋯,CM. 
 * Then Watson asks Sherlock to perform the following program:
 * 
 * 		for i = 1 to M do
 * 			for j = 1 to N do
 * 				if j % B[i] == 0 then
 * 					A[j] = A[j] * C[i]
 * 				endif
 * 		    end do
 * 		end do
 *
 * Can you help Sherlock and tell him the resulting array A? You should print all the 
 * array elements modulo (109+7).
 * 
 * Input Format 
 * The first line contains two integer numbers N and M. The next line contains N 
 * integers, the elements of array A. The next two lines contains M integers each, 
 * the elements of array B and C.
 * 
 * Output Format 
 * Print N integers, the elements of array A after performing the program modulo (109+7).
 * 
 * Constraints 
 * 1≤N,M≤105 
 * 1≤B[i]≤N 
 * 1≤A[i],C[i]≤105
 * 
 * Sample Input
 * 4 3
 * 1 2 3 4
 * 1 2 3
 * 13 29 71
 * 
 * Sample Output
 * 13 754 2769 1508

 */
public class SherlockAndQueries 
{
	private static void printElements(long[] A, long[] B, long[] C, int n, int m)
	{
		int    i;
		int    MOD	  = 1000000007;
		long[] countI = new long[m];
		
		for (i = 0; i < m; ++i)
		{
			if (countI[(int) B[i]] == -1)
			{
				countI[(int) B[i]] = C[i];
			}
			else
			{
				countI[(int) B[i]] *=  C[i];
				countI[(int) B[i]] %= MOD;
			}
		}
		
		for (i = 1; i <= m; ++i)
		{
			for (int j = 1; j * i <= n; ++j)
			{
				if (countI[i - 1] != -1)
				{
					A[(j - 1) * (i - 1)] *= countI[i - 1];
					A[(j - 1) * (i - 1)] %= MOD;
				}
			}
		}
		
		for (long e : A)
		{
			System.out.print((int) (e % MOD) + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int 	i;
		Scanner scanner = new Scanner(System.in);
		int		n	    = scanner.nextInt();
		int	    m  	 	= scanner.nextInt();
		long[] 	A	    = new long[n];
		long[]	B		= new long[m];
		long[]	C		= new long[m];
		
		for (i = 0; i < n; ++i)
		{
			A[i] = scanner.nextInt();
		}
		for (i = 0; i < m; ++i)
		{
			B[i] = scanner.nextInt();
		}
		for (i = 0; i < m; ++i)
		{
			C[i] = scanner.nextInt();
		}
		
		
		printElements(A, B, C, n, m);
		scanner.close();
	}

}
