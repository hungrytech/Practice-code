n = int(input())
data=list(map(int, input().split(' ')))
max_number=0
count=0
sum =0

# 최대가격을 찾는다.
for i in range(n) :
    if max_number < data[i] :
        max_number = data[i]

while count < n :
    for i in range(count, n) :
        if max_number!=data[i] :
            sum += max_number-data[i]
            count += 1
        if max_number==data[i] :
            max_number=0
            count+=1
            break

    for i in range(count, n) :
        if max_number < data[i]:
            max_number = data[i]

print(sum)