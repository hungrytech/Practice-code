# 이것이 코딩테스트다 DFS 알고리즘 학습
# 문제 : 얼음 만들기
# 문제 이해를 위해 클론코딩 하였다.

n, m = map(int, input().split())

graph=[]
# 얼음 틀 입력
for i in range(n) :
    graph.append(list(map(int, input())))

def dfs(x, y) :
    # 틀을 벗어나는경우 제외
    if x<=-1 or x>=n or y<=-1 or y>=m :
        return False
    # 연결되있는 틀 찾기 열결되어있으면 하나의 틀이 됨
    if graph[x][y] == 0 :
        graph[x][y]=1 # 방문처리
        dfs(x + 1,y)
        dfs(x -1, y)
        dfs(x, y-1)
        dfs(x, y+1)
        return True
    return False

result=0 # 얼음의 갯수
for i in range(n) :
    for j in range(m) :
        if dfs(i,j) == True :
            result+=1

print(result)