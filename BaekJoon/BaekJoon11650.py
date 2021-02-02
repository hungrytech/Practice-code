n = int(input())
data=list()
for _ in range(n) :
    k, m = map(int, input().split(' '))
    tu_data = (k, m)
    data.append(tu_data)

data = sorted(data)


for i in range(n) :
    print(data[i][0],data[i][1])