
public class Fonctions {
	
	public void printArray(int arr[][])	//Print multidimensional Array
	{
		for(int i=0; i < arr.length; i++)	//Rows
		{
			for(int j=0; j < arr[i].length; j++)	//Columns
			{
				System.out.print(arr[i][j] + " ");		//Print the row with all the elements
			}
			System.out.println();		//New line
		}
	}
	
	public int sumArray(int arr[][])	//Returns the sum of all elements in the Array
	{
		int total = 0;
		for(int i=0; i < arr.length; i++)		//Rows
		{	
			for(int j=0; j < arr[i].length; j++)		//Columns
			{	
				total += arr[i][j];		//Adds to total
			}
		}
		
		return total;		//Return the sum
	}

	public double getAverage(int arr[][])		//Returns the average of all elements in the Array
	{
		double elements = 0;
		for(int i=0; i < arr.length; i++)		//Rows
		{
			for(int j=0; j < arr[i].length; j++)		//Columns
			{
				elements++;		//Gets the number of elements
			}
		}
		
		double average = this.sumArray(arr)/(elements);	
		
		return average;		//Returns the average
	}
	
	public int getMaximum(int arr[][])		//Returns the maximum 
	{
		int max = arr[0][0];
		for(int i=0; i < arr.length; i++)		//Rows	
		{
			for(int j=0; j < arr[i].length; j++)		//Columns
			{
				if(max < arr[i][j])
				{
					max = arr[i][j];	//Set max
				}
			}
		}
		
		return max;		//Returns the max
	}
	
	public int getMinimum(int arr[][])		//Returns the minimum 
	{
		int min = arr[0][0];
		for(int i=0; i < arr.length; i++)		//Rows	
		{
			for(int j=0; j < arr[i].length; j++)		//Columns
			{
				if(min > arr[i][j])
				{
					min = arr[i][j];	//Set min
				}
			}
		}
		
		return min;
	}
	
	public int getMinimum(int arr[], int f, int l)		//Returns the minimum 
	{
		int min = arr[f];
		//System.out.println("f: " + f + " l: " + l);
		for(int i=f; i < l; i++)		//	Columns one dimensional array
		{
			if(min > arr[i])
			{
				min = arr[i];		//Set min
			}
		}
		
		return min;		//Return minimum
	}
	
	public boolean searchValueArray(int arr[][], int x)
	{
		for(int i=0; i < arr.length; i++)	// Rows
		{
			for(int j=0; j < arr[i].length; j++)	// Columns
			{
				if(x == arr[i][j])
				{		
					return true;		//if found, true
				}
			}
		}
		return false;	//else, false
	}
	
	public int getIndexofValueInArray(int arr[][], int x)
	{
		for(int i=0; i < arr.length; i++)		// Rows
		{
			for(int j=0; j < arr[i].length; j++)		// Columns
			{
				if(x == arr[i][j])
				{
					System.out.println("row: " + i + "| column: " + j);		// if found, print the indexes
					return x;
				}
			}
		}
		return -1;		//else, return -1
	}	
	
	public void arraySort(int arr[][])
	{
		//Changing the multidimensional array into a single dimensional one
		int size = (arr.length * arr[0].length);	
		int a[] = new int[size+1];//
		
		int count = 0;
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				a[count++] = arr[i][j];
				//System.out.println("a["+(count-1)+"]: " + a[count-1]); //Debug Help
			}
		}
		
		//Sort single dimensional array
		for(int c = 0; c < size; c++) 
			{
				//System.out.println(c);
				int min = this.getMinimum(a, c, size);
				//System.out.println("Min: " + min + " - length: " + c);  //Debug Help
				for(int i = c; i< size; i++)
				{
					if(a[i] == min)
					{
						a[i] = a[c];
						a[c] = min;
					}
				}
			}
		
		//Change
		int j =0, i=0;
		for(int x =0; x<size ;x++)
			{
			if(i == arr.length)
			{
				j++;
				i = 0;
			}
				arr[j][i] = a[x];
				i++;
			}
	}
	
	public void reversArray(int arr[][])
	{
		//Changing the multidimensional array into a single dimensional one
		int size = (arr.length * arr[0].length);
		int a[] = new int[size];
		
		int count = 0;
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				a[count++] = arr[i][j];
			}
		}
		
		//Reverse the Array
		int w;
		for(int q = 0; q < a.length/2; q++)
		{
			w = a[q];
			a[q] = a[a.length-q-1];
			a[a.length-q-1] = w;
		}
			
		//Changing back to multidimensional Array
		int j =0, i=0;
		for(int x =0; x<size ;x++)
			{
			if(i == arr.length)
			{
				j++;
				i = 0;
			}
				arr[j][i] = a[x];
				i++;
			}
	}
}


