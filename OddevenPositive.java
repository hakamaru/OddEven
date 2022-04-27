package com;

import java.util.Scanner;

public class OddevenPositive {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc= new Scanner(System.in);
		int ab=0;
		int cd=0;
		int ef=0;
		
		System.out.println("Enter The Integers:  ");
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			if(arr[i]>0)
			{
				ab++;
			}
			if(arr[i]%2==0)
			{
				cd++;
			}
			if(arr[i]%2!=0)
			{
				ef++;
			}
			
		}
		System.out.println("There are " + ab + " Positive Numbers");
		System.out.println("There are " + cd + " even Numbers");
		System.out.println("There are " + ef + " Odd Numbers");

	}

}
