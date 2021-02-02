import sys
n = int(sys.stdin.readline())


data_list = [0]*10001

for _ in range(n) :
    m = int(sys.stdin.readline())
    data_list[m] +=1

for i in range(10001) :
    if data_list[i] !=0 :
        for j in range(data_list[i]) :
            print(i)