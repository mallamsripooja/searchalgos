/*
Binary search algorithm implemenation
Space complexity = O(1)
Time complexity = O(logn)
*/
public class BinarySearch{
	
	private static int search(int[] arr, int num, int l, int r){
		int mid = l+(r-l)/2;
		if (r>=l)
		{
			if (arr[mid]==num)
			{
				return mid+1;
			}
			else if (arr[mid]<num)
			{
				return search(arr, num, mid+1, r);
			}
			else if (arr[mid]>num)
			{
				return search(arr, num, l, mid-1);
			}
		}
		return -1;
	}

	public static void main(String[] args){
		// Prerequisite for binary search algorithm is that the array must be sorted.
		int arr[] = {4, 28, 31, 45, 47, 50, 59, 78, 80, 93};

		System.out.printf("Num %d is at position %d in the given array.\n",47,search(arr, 47, 0, arr.length));
		System.out.printf("Num %d is at position %d in the given array.",5,search(arr, 5, 0, arr.length));
	}
}