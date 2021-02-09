n = int(input())
data=[]
data_count=[]
for _ in range(n) :
    book = str(input())
    if book in data :
        data_count[data.index(book)] +=1
    else :
        data.append(book)
        data_count.append(1)

tup = []
for i in range(len(data)) :
    tup.append((data[i],data_count[i]))

data.clear()
tup = sorted(tup, key=lambda x:x[1])
maxNumber = tup[-1][1]

for i in range(len(tup)) :
    if tup[i][1] == maxNumber :
        data.append(tup[i][0])

data=sorted(data)
print(data[0])



