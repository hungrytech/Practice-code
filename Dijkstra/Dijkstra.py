import heapq

# 그래프 정보 기입
mygraph= {
    'A':{'B':8, 'C':1, 'D':2},
    'B': {},
    'C' : {'B':5,'D':2},
    'D' : {'E':3, 'F' :5},
    'E' : {'F':1},
    'F' : {'A':5}
}

# 최단경로 다익스트라 알고리즘
def dijkstra(graph, start) :
    # 그래프의 노드와 값을 입력해준다 값은 먼저 무한대인 inf를 넣어준다.
    distances = {node:float('inf') for node in graph}
    # 첫번째 노드 즉 start 노드는 최단경로가 0 이므로 0을 넣어준다.
    distances[start] = 0
    # minheap을 구현할 리스트를 만들어준다.
    queue=[]
    # minheap에 start노드를 넣어준다.
    heapq.heappush(queue, [distances[start],start])

    # queue에 들어있는 데이터가 없을때까지 반복한다.
    while queue :
        # minheap 에서 해당노드까지의 거리와 노드를 꺼낸다.
        current_distance, current_node = heapq.heappop(queue)
        # distances의 들어있는 해당 노드까지의 최단거리가 minheap에서 꺼낸 노드의 최단거리 정보보다 작으면 변경하지 않는다.
        if distances[current_node] < current_distance :
            continue

        # 그래프에서 현재 노드와 연결되있는 노드와 최단거리를 꺼내 distances에 있는 정보와 비교한다.
        for adjacent, weight in graph[current_node].items() :
            distance = current_distance + weight
            # distances의 들어있는 해당노드까지의 최단거리보다 작으면 distances의 해당노드의 최단거리를 바꿔주고 minheap에 넣는다.
            if distance < distances[adjacent] :
                distances[adjacent] = distance
                heapq.heappush(queue, [distance, adjacent])

    # start 노드부터 해당노드까지의 최단거리정보를 가지고있는 리스트를 리턴한다.
    return distances


