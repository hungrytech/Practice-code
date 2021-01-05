# 선택정렬

# 데이터 입력
data = list(map(int, input().split()))

def selection_sort(data) :
    for stand in range(len(data)-1) :
        lowest = stand
        for index in range(stand+1, len(data)) :
            if data[lowest] > data[index] :
                lowest = index
        data[lowest], data[stand] = data[stand], data[lowest]
    return data

print(selection_sort(data))