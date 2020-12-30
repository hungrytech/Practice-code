def binarySearch(arr,target,start,end) :
    while start <= end :
        min_index = (start + end) // 2
        mid=arr[min_index]
        if mid < target :
            start = min_index+1

        elif mid > target :
            end = min_index-1

        elif mid == target :
            return min_index

    return None

