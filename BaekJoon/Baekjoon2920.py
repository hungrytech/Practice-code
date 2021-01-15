data= list(map(int, input().split()))


def solution(data) :
    ascending =True
    descending= True
    for i in range(1, 8) :
        if data[i] > data[i-1] :
            descending =False
        elif data[i] < data[i-1] :
            ascending=False
    if ascending :
        print("ascending")
    elif descending :
        print("descending")
    else :
        print("mixed")



solution(data)


