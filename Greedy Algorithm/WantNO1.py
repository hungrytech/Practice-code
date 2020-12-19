# 이것이 코딩테스트다 그리디 알고리즘 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.

# 문제: 1이 될 때까지

# N, K 를 입력받는다
n, k = map(int, input().split())
result=0
while n>=k :
    if n%k!=0 : # 나눌 수 없는경우 -1
        n-=1
        result+=1
    else : #나눌 수 있는경우 나눈몫을 반환
        n//=k
        result+=1
while True :
    if n!=1 : #1이 될떄까지 -1
        n-=1
        result+=1
    else:
        break

print(result)
