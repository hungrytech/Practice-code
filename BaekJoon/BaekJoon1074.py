import sys

def solution(n, x, y) :
    global result
    if n == 2 :
        if x == X and y == Y :
            print(result)
            return
        result+= 1
        if x == X and y+1 == Y :
            print(result)
            return
        result+= 1

        if x+1 == X and y == Y :
            print(result)
            return
        result +=1

        if x+1 == X and y+1 == Y :
            print(result)
            return
        result+=1
        return
    solution(n/2, x, y)
    solution(n/2, x, y+n/2)
    solution(n/2, x+n/2, y)
    solution(n/2, x+n/2, y+n/2)

n, X, Y = map(int, sys.stdin.readline().split(' '))
result=0
solution(2**n, 0, 0)