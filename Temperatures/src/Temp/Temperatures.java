package Temp;

import java.util.Scanner;
public class Temperatures {

	public static void inputTempForMonth(int month, int[][]temperatures)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Lowest temperature ");
		temperatures[month][0] = in.nextInt();
		System.out.print("Highest temperature ");
		temperatures[month][1] = in.nextInt();
	}
	public static int[][] inputTempForYear()
	{
		int[][] temperatures = new int[12][2];
		
		for(int i = 0; i < 12; i++)
		{
			System.out.println(i + ")Lowest and highest temperatures for month " + Months.values()[i] );
			inputTempForMonth(i, temperatures);
		}
		
		return temperatures;
	}
	public static double calculateAverageHigh(int[][]temperatures)
	{
		double average = 0 ;
		for(int i =0 ; i < temperatures.length; i++)
		{
			average += temperatures[i][1];
		}
		return (double) average/temperatures.length;
	}
	public static double calculateAverageLow(int[][]temperatures)
	{
		double average = 0 ;
		for(int i =0 ; i < temperatures.length; i++)
		{
			average += temperatures[i][0];
		}
		return (double) average/temperatures.length;
	}
	public static int findHighestTemp(int[][]temperatures)
	{
		double max = temperatures[0][1];
		int index = 0;
		for(int i =0 ; i < temperatures.length; i++)
		{
			if(temperatures[i][1] > max )
			{
				max = temperatures[i][1];
				index = i;
			}
		}
		return index;
	}
	public static int  findLowestTemp(int[][]temperatures)
	{
		double min = temperatures[0][0];
		int index = 0;
		for(int i =0 ; i < temperatures.length; i++)
		{
			if(temperatures[i][0] < min )
			{
				min = temperatures[i][0];
				index = i;
			}
		}
		return index;
	}
	
}
