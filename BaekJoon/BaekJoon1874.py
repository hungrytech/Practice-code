n = int(input())


count= 1
stack=[]
result=[]
for i in range(1 , n+1) : # 데이터 개수만큼 반복
    data =  int(input())
    while count <= data : # 입력 받은 데이터에 도달할때까지 삽입
        stack.append(count)
        result.append("+")
        count+=1

    if data == stack[-1] : #입력받은 데이터가 스택에 맨위에 있을때 "-" 출력
        stack.pop()
        result.append("-")
    else : #불가능할 경우
        print('NO')
        exit(0)

print("\n".join(result))



