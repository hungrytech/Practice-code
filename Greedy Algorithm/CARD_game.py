# 이것이 코딩테스트다 그리디 알고리즘 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 숫자 카드 게임
# 숫자 카드 게임 min 함수 이용
n, m = map(int, input().split()) #n, m 공백으로 구분하여 받기

result =0; #결과출력값

for i in range(n) :
    data = list(map(int, input().split()))
    min_value=min(data) #min함수 이용해서 그 행의 가장 작은수 찾기
    if min_value > result :  #작은수 중에 큰 수 찾기
        result = min_value

print(result)

# 숫자 카드 게임 이중 for문 이용 함수 이용
n, m = map(int, input().split()) #n, m 공백으로 구분하여 받기
tmp = 0 # 리스트의 들어있는 수들을 비교하기 위한 임시값
min_value = 0 # 행의 가장 작은수
result = 0 #결과 출력값
for i in range(n) :
    data = list(map(int, input().split()))
    tmp = data[0]
    for j in data :
        if tmp > j :
            tmp = j
    min_value = tmp

result = min_value

print(result)





