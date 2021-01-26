
n = int(input())
data = list(map(int, input().split(' ')))
data=sorted(data)
m = int(input())
data_m = list(map(int, input().split(' ')))
for target in data_m :
    left_index = 0
    right_index = len(data) - 1
    while left_index <= right_index :
        pivot_index = (left_index+right_index)//2
        pivot = data[pivot_index]

        if target > pivot :
            left_index = pivot_index+1

        elif target < pivot :
            right_index = pivot_index-1

        elif target == pivot :
            print(1)
            break
    if left_index > right_index :
        print(0)





