import sys


n = int(sys.stdin.readline())

data_A, data_B = list(), list()
result=0



data_A = list(map(int, sys.stdin.readline().split(' ')))
data_B = list(map(int, sys.stdin.readline().split(' ')))

data_B = sorted(data_B)
data_A = sorted(data_A, reverse=True)

for i in range(n) :
    result+= data_A[i]*data_B[i]

print(result)
