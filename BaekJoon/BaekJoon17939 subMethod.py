n = int(input())
data = list(map(int, input().split(' ')))

mx , result = 0, 0
for i in data[::-1]:
    if i > mx:
        mx = i
    else:
        result += mx - i

print(result)