# 이것이 코딩테스트다 BFS 알고리즘 학습
# BFS 구조를 이해하기 위해 클론 코딩을 하였다.

from collections import deque
def bfs(graph, start, visited):
    queue=deque([start])
    visited[start]=True #현재 노드를 방문처리
    while queue :
        v=queue.popleft() # 큐에서 원소를 뽑아 출력
        print(v,end=' ')
        for i in graph[v] :  # 해당 원소와 연결된 방문하지 않은 원소를 큐에 삽입
            if not visited[i] :
                queue.append(i)
                visited[i]=True

visited=[False]*9

graph=[[],
       [2,3,8],
       [1,7],
       [1,4,5],
       [3,5],
       [3,4],
       [7],
       [2,6,8],
       [1,7]]

bfs(graph, 1, visited)