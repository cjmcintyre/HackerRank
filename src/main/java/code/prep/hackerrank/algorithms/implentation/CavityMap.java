package code.prep.hackerrank.algorithms.implentation;

import java.util.Scanner;

/**
 * Problem Statement
 * You are given a square n×n map. Each cell of the map has a value in it 
 * denoting the depth of the appropriate area. We will call a cell of the map 
 * a cavity if and only if this cell is not on the border of the map and each
 * cell adjacent to it has strictly smaller depth. Two cells are adjacent if
 * they have a common side. You need to find all the cavities on the map and
 * depict them with character X.
 * 
 * Input Format
 * The first line contains an integer n (1≤n≤100), denoting the size of the map.
 * each of the following n lines contains n positive digits without spaces.
 * A digit (1-9) denotes the depth of the appropriate area.
 * 
 * Output Format
 * Output n lines, denoting the resulting map. Each cavity should be replaced with 
 * character X.
 * 
 * Sample Input
 * 4
 * 1112 
 * 1912
 * 1892
 * 1234
 * 
 * Sample Output
 * 1112
 * 1X12
 * 18X2
 * 1234
 */

public class CavityMap 
{
	private static void printRow(int n, int num)
    {  

        int[] row = new int[n];
        
        for (int i = n - 1; i > -1; --i) 
        {
            int tmp     = num % 10;
                num     = (int) Math.floor(num / 10);
                row[i]  = tmp;
        }
        
		if (n == 1)
		{
			System.out.println(row[0]);
		}
		else if (n == 2)
		{
			System.out.print(row[0]);
			System.out.println(row[1]);
		}
		else
		{
        
	        System.out.print(row[0]);
	        for (int i = 1; i < n - 1; ++i)
	        {
	            if (row[i] > row[i - 1] && row[i] > row[i + 1]) 
	            {
	                System.out.print('X');
	            }
	            else 
	            {
	                System.out.print(row[i]);
	            }
	        }
	        System.out.println(row[n - 1]);
		}

    }
	
	private static void printRow(int n, double num)
    {  

        int[] row = new int[n];
        
        for (int i = n - 1; i > -1; --i) 
        {
            double tmp     = num % 10;
                   num     = Math.floor(num / 10);
                   row[i]  = (int) tmp;
        }
        
		if (n == 1)
		{
			System.out.println(row[0]);
		}
		else if (n == 2)
		{
			System.out.print(row[0]);
			System.out.println(row[1]);
		}
		else
		{
        
	        System.out.print(row[0]);
	        for (int i = 1; i < n - 1; ++i)
	        {
	            if (row[i] > row[i - 1] && row[i] > row[i + 1]) 
	            {
	                System.out.print('X');
	            }
	            else 
	            {
	                System.out.print(row[i]);
	            }
	        }
	        System.out.println(row[n - 1]);
		}

    }
    
    public static void main(String[] args)
    {
        int        size;
        Scanner scanner = new Scanner(System.in);
        
        size = scanner.nextInt();
        
        if (scanner.hasNextInt())
        {
        	for (int i = 0; i < size; ++i)
            {
            	printRow(size, scanner.nextInt());
            }
        }
        else
        {
        	for (int i = 0; i < size; ++i)
            {
            	printRow(size, scanner.nextDouble());
            }
        }
          
        scanner.close();
    }

}
