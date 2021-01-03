
n = int(input()) # 수열의 항

data=[0]*1001 # 최대 1000번까지
data[1]=1
data[2]=1

def Fibonacci(value) :
    # 각 계산한 값을 그 수열의 항 인덱스에 삽입
    for i in range(3, value+1) :
        data[i] = data[i-1] + data[i-2]

    return data[value]

print(Fibonacci(n))