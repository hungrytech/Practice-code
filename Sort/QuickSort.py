#데이터를 받아 리스트로 저장한다.
data = list(map(int, input().split()))


def Quicksort(arr, low, high) :
    if low >= high: return
    pivot= arr[(low+high)//2]
    left =low
    right = high

    while left <= right :
        while arr[left] < pivot :
            left+=1
        while arr[right] > pivot :
            right-=1

        if left <= right : # swap
            arr[left], arr[right] = arr[right], arr[left]
            left+=1
            right-=1

    if right >= low : #왼쪽 배열
        Quicksort(arr, low, right)
    if left <= high : # 오른쪽 배열
        Quicksort(arr, left, high)

    # 함수 끝

Quicksort(data, 0, len(data)-1)
print(data)
