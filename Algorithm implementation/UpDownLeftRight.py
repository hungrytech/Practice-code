# 이것이 코딩테스트다 구현 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 상하좌우

# 직접 풀이해본 코드 (1)
n = int(input()) # 공간의 크기

data = list(map(str, input().split()))
# 첫 좌표
nx = 1
ny = 1

for i in data :
    if i=='R' :
        nx += 1
        if nx>n: # 벗어날경우 행위 취소
            nx -= 1
            continue
    elif i=='l' :
        nx -= 1
        if nx<=0 : # 벗어날경우 행위 취소
            nx += 1
            continue
    elif i =='U' :
        ny -=1
        if ny<=0 : # 벗어날경우 행위 취소
            ny += 1
            continue
    elif i == 'D' :
        ny += 1
        if ny >n : # 벗어날경우 행위 취소
            ny -= 1
            continue

print(ny, nx)

# (1)은 시간 복잡도가 높다고 생각해 책에 나온 해답을 보고 이해한 코드
n = int(input())  #공간의 크기

data = list(map(str, input().split()))
x = 1
y = 1
movetype = ['U', 'D', 'R', 'L'] # 움직이는 유형

# 움직이는 유형의 각 index에 맞추어 움직이는 값
move_x = [-1, 1 , 0 , 0]
move_y = [0, 0, 1, -1]

for moveplan in data : # 이동계획을 하나씩 확인
    for i in range(len(movetype)) :
        if movetype[i]==moveplan : # 이동후 좌표
            nx= x +move_x[i]
            ny= y +move_y[i]
    if nx<=0 or nx>n or ny>n or ny<=0 : # 공간을 벗어나는 경우 무시
        continue
    else :
        x = nx
        y = ny
# 이동을 수행한 좌표
print(x, y)

