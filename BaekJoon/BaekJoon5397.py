Test_Case=int(input())

for _ in range(Test_Case) :
    data = input()
    cosor_index = 0
    left_stack=[] #결과 낼 스택
    right_stack=[] # 잠시 보관 스택

    for i in data :
        if i=='<':
            if left_stack :
                right_stack.append(left_stack.pop())

        elif i=='>' :
            if right_stack :
                left_stack.append(right_stack.pop())

        elif i=='-' :
            if left_stack:
                left_stack.pop()

        else :
            left_stack.append(i)
    left_stack.extend(reversed(right_stack))
    print(''.join(left_stack))


