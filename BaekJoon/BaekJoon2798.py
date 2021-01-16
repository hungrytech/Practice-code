n, m = map(int, input().split(' '))
data= list(map(int, input().split(' ')))

result=0
for i in range(0, len(data)) :
    for j in range(i+1, len(data)) :
        for k in range(j+1, len(data)) :
            result_value= data[i]+data[j]+data[k]
            if result_value <= m :
                result = max(result, result_value)

print(result)