'''
Implementation of binary search algorithm in Python
Space complexity = O(1)
Time complexity = O(logn)
Prerequisites - the array passed to the binarysearch method must be sorted
'''
def binarysearch(arr,l,r,x):
    mid=l+(r-l)//2
    if (r>=l):
        if (arr[mid]==x):
            return mid
        elif (arr[mid]>x):
            return binarysearch(arr,l,mid-1,x)
        else:
            return binarysearch(arr,mid+1,r,x)
    return -1

arr1=[1,10,23,42,56,78,90,106]
print("42 is at position ",binarysearch(arr1,0,len(arr1),42)," in the given array")
print("4 is at position ",binarysearch(arr1,0,len(arr1),4)," in the given array")
