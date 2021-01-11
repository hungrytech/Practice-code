def bfs(graph, start_node) :
    visited =list() # 방문노드 저장
    need_visit=list()

    need_visit.append(start_node)
    while need_visit :
        node=need_visit.pop(0)
        if node not in visited :
            visited.append(node)
            need_visit.extend(graph[node])

    return visited



data=dict()


data['A'] = ['B','C']
data['B'] = ['A','D']
data['C'] = ['A','G','H','I']
data['D'] = ['E','F']
data['E'] = ['D']
data['F'] = ['D']
data['G'] = ['C']
data['H'] = ['C']
data['I'] = ['C','J']
data['J'] = ['I']
print(bfs(data, 'A'))