/*
Linear Search algorithm implementation
Space complexity = O(1)
Time complexity = O(n)
*/
public class LinearSearch{

	private static int search(int arr[], int num){
		for (int i=0; i<arr.length ;i++ )
		{
			if (arr[i]==num)
			{
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int arr[] = {90,11,56,4,0,34,78,21,83,40};
		int searchNum = 34;

		System.out.printf("Number %d is at position %d in the given array.",searchNum, LinearSearch.search(arr, searchNum));
	}
}