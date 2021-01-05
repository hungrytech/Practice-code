# 삽입정렬

# 데이터 입력
data=list(map(int, input().split()))

def insertionSort(data) :
    for index in range(len(data)-1) :
        for index2 in range(index+1, 0, -1) :
            if data[index2] < data[index2-1] :
                data[index2], data[index2-1] = data[index2-1], data[index2]

    return data

print(insertionSort(data))