import sys

k, A = map(int, sys.stdin.readline().split(' '))

data=list(map(int, sys.stdin.readline().split(' ')))

data = sorted(data)

print(data[A-1])