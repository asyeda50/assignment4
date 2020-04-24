package assignment4;

import java.util.*;
public class StrictlyIdentical {
	
//Enter elements of list 1: 23 55 31 2 10
//Enter elements of list 2: 23 55 3 2 10
//Two lists are not strictly identical
	
public static boolean equals(int[] array1,int[] array2)
{
	boolean equal=false;
	for(int i=0; i<array1.length; i++)
	{
		if (array1[i]==array2[i])
		{
		equal=true;
		}
		else
		{
		equal=false;
		break;
		
		}
	}
	return equal;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1=new int [5];
		int [] array2=new int [5];
		
		Scanner  sc=new Scanner(System.in);
		System.out.println ("Enter 5 elements of list 1:");
			for (int i=0; i<5; i++)
			{
		array1[i]=sc.nextInt();
			}
		System.out.println("Enter 5 elements of list 2:");
		for(int i=0; i<5; i++)
		{
		array2[1] = sc.nextInt();
		}
		
		if (StrictlyIdentical.equals(array1, array2))
			{
		System.out.println("Two lists are strictly identical");
			}
		else
			{
			System.out.println("Two lists are not strictly identical");
		
		
		}

	}

}
