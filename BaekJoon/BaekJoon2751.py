import sys

n = int(sys.stdin.readline())
data=[]
for i in range(n) :
    data.append(int(sys.stdin.readline()))

data = sorted(data)

for i in range(n) :
    print(data[i])