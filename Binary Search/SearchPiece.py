# 이것이 코딩테스트다 이진 탐색 알고리즘 학습
# 문제 : 부품 찾기


def binarysearch(arr, target, start, end) : #이진탐색
    mid_index = (start+end)//2
    mid = arr[mid_index]
    if start > end :
        return "no"
    if mid < target :
        return binarysearch(arr, target, mid_index+1, end)

    elif mid > target :
        return binarysearch(arr, target, start, mid_index-1)

    elif mid == target :
        index = ((start + end) // 2)
        return "yes"



n=int(input()) # 부품 개수

data_n=list(map(int, input().split())) #부품

m=int(input()) #찾는 부품 개수

data_m =list(map(int, input().split())) # 찾는 부품
# 각 data를 정렬해준다.
data_n.sort()
data_m.sort()
result=[]
# 찾는 부품들이 있는지 이진탐색으로 확인
for i in range(m) :
    result= binarysearch(data_n, data_m[i], 0 , len(data_n)-1)
    print(result, end=' ')