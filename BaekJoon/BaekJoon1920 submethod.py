n = int(input())
data = set(map(int, input().split(' ')))

m = int(input())
data_m = list(map(int, input().split(' ')))

for i in data_m :
    if i not in data :
        print(0)

    else :
        print(1)