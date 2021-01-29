n = int(input())
data=list()
for _ in range(n):
    m=int(input())
    data.append(m)

data=sorted(data)
for i in data :
    print(i)