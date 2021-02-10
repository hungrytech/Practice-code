n = int(input())

count = 0
maxheigth = 0
data=[]
for _ in range(n) :
    data.append(int(input()))

def viewTrop(data, n) :
    global count
    global maxheigth
    for i in range(len(data)) :
        if maxheigth < data[i] :
            maxheigth = data[i]
            count +=1


# 왼쪽구하기
left=0
right=0
viewTrop(data, n)
left = count
#오른쪽구하기

count=0
maxheigth=0

viewTrop(data[::-1], n)
right = count

print(left)
print(right)



