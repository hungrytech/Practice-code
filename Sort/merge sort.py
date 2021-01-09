import random
# 분리
def mergesort_split(data) :
    if len(data)<= 1:
        return data
    mid_index = len(data)//2
    # left
    left = mergesort_split(data[:mid_index])
    # right
    right = mergesort_split(data[mid_index:])
    return merge(left, right)
# 병합
def merge(left, right) :
    merged=list()
    left_index=0
    right_index=0
    # case1 둘다 남아있을때
    while len(left) > left_index and len(right) > right_index :
        if left[left_index] > right[right_index] :
            merged.append(right[right_index])
            right_index+=1
        else :
            merged.append(left[left_index])
            left_index += 1
    # left만 남아있을때
    if len(left) > left_index :
        merged=merged+left[left_index:]
    # right만 남아있을때
    if len(right) > right_index :
        merged=merged+right[right_index:]
    return merged


data= random.sample(range(1000), 100)
print(mergesort_split(data))