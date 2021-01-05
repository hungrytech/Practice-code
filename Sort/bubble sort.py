# 버블정렬

#데이터 입력
data=list(map(int, input().split()))

def bubble_sort(data) :
    for index in range(len(data)-1) :
        swap=False
        for index2 in range(len(data)-index-1) :
            if data[index2] > data[index2+1] :
                data[index2], data[index2+1] = data[index2+1], data[index2]
                swap=True # 스왑이 될경우 True로 바꿈

        # 첫시도에서 swap이 없을경우 해줄필요가 없음. 이미 정렬되어 있는 상태이므로 종료
        if swap==False :
            break
    return data

print(bubble_sort(data))

