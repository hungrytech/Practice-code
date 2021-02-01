n = int(input())
data=list()
for _ in range(n) :
    k, m = map(str, input().split(' '))
    tu_data = (int(k), m)
    data.append(tu_data)

data = sorted(data, key=lambda x:x[0])

for i in range(n) :
    print(data[i][0],data[i][1])