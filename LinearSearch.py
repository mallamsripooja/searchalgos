def linearsearch(arr, x):
    for i in range(len(arr)):
        if arr[i]==x:
            return i+1;
    return -1;

print (linearsearch([23,4,67,8,12,3],67))
print (linearsearch([23,4,67,8,12,3,45,62],9))
