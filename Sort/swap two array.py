# 이것이 코딩테스트다 정렬 알고리즘 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 두 배열의 원소 교체


n, k = map(int, input().split())
A=list(map(int, input().split()))
B=list(map(int, input().split()))
A=sorted(A)
B=sorted(B, reverse=True)

print(A)
print(B)
for i in range(k) :
    if A[i] < B[i] :
        A[i], B[i] = B[i], A[i]
    else :
        break
print(sum(A))


