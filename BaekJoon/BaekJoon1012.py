import sys
sys.setrecursionlimit(10000)

def dfs(x, y) :
    # 맵 벗어나면 안함.
    if x <= -1 or x >= m or y <= -1 or y >= n :
        return False

    if data[x][y] == 1 :
        data[x][y] = 0
        dfs(x+1, y)
        dfs(x -1, y)
        dfs(x , y+1)
        dfs(x, y-1)
        return True

    return False

test_case =int(input())

for a in range(test_case) :
    m, n, k = map(int, input().split(' '))

    data = [[0] * n for i in range(m)]

    for i in range(k) :
        x, y = map(int, input().split(' '))
        data[x][y] = 1


    count=0 #지렁이 개수

    for i in range(m) :
        for j in range(n) :
            if dfs(i,j) == True :
                count+=1

    print(count)
