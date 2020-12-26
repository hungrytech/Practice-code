# 이것이 코딩테스트다 DFS 알고리즘 학습
# DFS 구조를 이해하기 위해 클론 코딩을 하였다.

def dfs(graph, v, visited) :
    # 현재 노드를 방문 처리
    visited[v] = True
    print(v,end=' ')
    #현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for i in graph[v] :
        if not visited[i] : #조건이 거짓일 때 수행
            dfs(graph, i, visited)

visited =[False]*9
graph = [
    [],
    [2,3,8],
    [1,7,8],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [6,8],
    [1,7]]

dfs(graph, 1, visited)