n = int(input())
n=str(n)
data=list()
for i in n :
    data.append(int(i))

data = sorted(data, reverse=True)
result=""
for i in data :
    result+=str(i)

print(result)