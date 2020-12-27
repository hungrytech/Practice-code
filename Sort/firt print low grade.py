# 이것이 코딩테스트다 정렬 알고리즘 학습
# 문제를 읽고 직접 짜본 코드이다.
# 알고리즘을 구상하다 모르겠으면 해답을보고 다시 구상해본다.
# 문제: 성적이 낮은 순서로 학생 출력하기

n = int(input())
data=[]

for i in range(n) :
    data_input = input().split()
    data.append((data_input[0],int(data_input[1])))

result= sorted(data, key=lambda student: student[1])

for student in result :
    print(student[0], end=' ')