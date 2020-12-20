# 이것이 코딩테스트다 구현 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 시각

n = int(input()) #시간을 받는다
count = 0 # 3이 포함되있을 경우 count

for i in range(n+1) :
    for j in range(60) :
        for t in range(60) :
            if '3' in str(i)+str(j)+str(t) : #문자열에서 3이 있으면 count에 1 추가
                count+=1

print(count)




