package com.girmiti.javaprograms;
/*
 * Author:Rathinam Somasundaram
 */
import java.util.Scanner;
public class Volume_of_cube {

	public static void main(String[] args) {
		
		/*Declaration of Variables*/
		double length;
		double volume;
		
		/*Creating Scanner object*/
		Scanner input = new Scanner(System.in);
		
		/*Input for length*/
		System.out.println("Enter the length");
		length = input.nextDouble();
		
		/*Calculating volume of a cube*/
		volume = length*length*length;
		
		/*Printing results*/
		System.out.println("the volume of a cube is "+" "+ volume);
		
		
	}

}
