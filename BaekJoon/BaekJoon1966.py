
test_case = int(input())
for _ in range(test_case) :
    n, m = map(int, input().split(' '))
    data= list(map(int, input().split(' ')))
    data= [(data[i], i) for i in range(len(data))]
    count=0
    while True :
        if data[0][0] == max(data, key=lambda x :x[0])[0] :
            count+=1
            if data[0][1] == m :
                print(count)
                break
            else :
                data.pop(0)
        else :
            data.append(data.pop(0))

