# 이것이 코딩테스트다 정렬 알고리즘 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 위에서 아래로

n = int(input())
data=[]
for i in range(n) :
    data.append(int(input()))

result= sorted(data,reverse=True)

for i in result :
    print(i, end=' ')
