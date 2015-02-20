package Temp;

import java.time.Month;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int [][] temperatures = Temperatures.inputTempForYear();
		
		//
		System.out.print("Average high temperature of the year is ");
		System.out.println(Temperatures.calculateAverageHigh(temperatures) );
		
		System.out.print("Average low temperature of the year is ");
		System.out.println(Temperatures.calculateAverageLow(temperatures));
		
		System.out.print("Highest temperature of the year is at  ");
		int tempIndex = Temperatures.findHighestTemp(temperatures);
		System.out.println(Months.values()[tempIndex] + " "+ temperatures[tempIndex][1]);
		
		System.out.print("Lowest temperature of the year is at  ");
		tempIndex = Temperatures.findLowestTemp(temperatures);
		System.out.println(Months.values()[tempIndex] + " "+ temperatures[tempIndex][0]);
	}
}
