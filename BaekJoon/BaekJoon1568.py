import sys

n = int(sys.stdin.readline())

k = 1
time = 0

while n!=0 :
    if k > n :
        k=1
    n -= k
    k+=1
    time +=1
print(time)