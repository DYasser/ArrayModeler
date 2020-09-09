import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[20][20];
		
		for(int i =0; i<20;i++)
		{
			for(int j = 0; j< 20; j++)
			{
				arr[i][j] = Math.abs(rand.nextInt()%10);
			}
		}

		Fonctions obj = new Fonctions();
		
		System.out.println("We just created a random 20 by 20 Array!\n"
				+ "Choose what option you want:\t[-1 to exit]\n");
		System.out.println(	"\n1 - Print the Array.\n"
				+ "2 - Get the sum of all the elements from the Array.\n"
				+ "3 - Get the average of all the elements from the Array.\n"
				+ "4 - Get the Maximum value.\n"
				+ "5 - Get the minimum value.\n"
				+ "6 - Search for a value in the array.\n"
				+ "7 - Get for the index of a value.\n"
				+ "8 - Sort the Array.\n"
				+ "9 - Reverse the Array.\n");
		choice = input.nextInt();
		while(choice != -1)
		{
			
			
			
			switch(choice)
			{
			case 1:	obj.printArray(arr);
				break;
			case 2:	System.out.println("Sum: " + obj.sumArray(arr));
				break;
			case 3:	System.out.println("Average: " + obj.getAverage(arr));
				break;
			case 4:	System.out.println("Maximum: " + obj.getMaximum(arr));
				break;
			case 5:	System.out.println("Minimum: " + obj.getMinimum(arr));
				break;
			case 6:	
				System.out.println("\nInput the value you want to search for,\nwe will tell"
						+ " you if it is there or not:");
				choice = input.nextInt();
				System.out.println(obj.searchValueArray(arr, choice));
				break;
			case 7:
				System.out.println("\nInput the value you want to search for:");
				choice = input.nextInt();
				obj.getIndexofValueInArray(arr, choice);
				break;
			case 8: obj.arraySort(arr); System.out.println("Sorted.\n");
				break;
			case 9: obj.reversArray(arr); System.out.println("Reversed.\n");
				break;
			}

			System.out.println(	"\n1 - Print the Array.\n"
					+ "2 - Get the sum of all the elements from the Array.\n"
					+ "3 - Get the average of all the elements from the Array.\n"
					+ "4 - Get the Maximum value.\n"
					+ "5 - Get the minimum value.\n"
					+ "6 - Search for a value in the array.\n"
					+ "7 - Get for the index of a value.\n"
					+ "8 - Sort the Array.\n"
					+ "9 - Reverse the Array.\n");
			choice = input.nextInt();
		}
		
	}
}
