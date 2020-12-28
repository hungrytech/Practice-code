# 이것이 코딩테스트다 BFS 알고리즘 학습
# 문제 : 미로 최단길이 찾기

from collections import deque
n, m = map(int, input().split())  # 행, 열 길이
graph=[]
for i in range(n) : #그래프를 입력받는다
    graph.append(list(map(int, input())))


dx=[-1,1,0,0] #좌, 우
dy=[0,0,-1,1] #상, 하

def bfs(x,y) :
    queue=deque()
    queue.append((x,y))
    while queue : # queue가 빌 때까지 반복
        x,y = queue.popleft()
        for i in range(4) :
            nx = x+dx[i]
            ny= y+dy[i]
            if nx <0 or nx >= m or ny <0 or ny >= n :
                continue #맵을 벗어나는경우 제거

            if graph[nx][ny] == 0 :
                continue # 괴물을 만난경우에도 제거
            if graph[nx][ny] == 1 :
                graph[nx][ny] = graph[x][y] +1 # 자기 값의 +1을 해준다
                queue.append((nx,ny))

    return graph[n-1][m-1]

print(bfs(0,0))