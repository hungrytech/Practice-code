def binarysearch(arr, traget, start, end) :
    mid_index = (start+end)//2
    mid = arr[mid_index]
    if start > end :
        return -1
    if mid < target :
        return binarysearch(arr, traget, mid_index+1, end)

    elif mid > target :
        return binarysearch(arr, traget, start, mid_index-1)

    elif mid == target :
        index = ((start + end) // 2)
        return index


