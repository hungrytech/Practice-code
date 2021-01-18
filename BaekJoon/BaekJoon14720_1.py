n = int(input())
data=list(map(int,input().split(' ')))


drink_number=0
strawberry=False
choco=False


for i in range(n) :
    if data[i] == 0 and strawberry==False :
        strawberry=True
        drink_number+=1

    elif data[i] == 1 and (strawberry==True and choco==False) :
        choco=True
        drink_number+=1
    elif data[i] == 2 and choco==True :
        drink_number+=1
        strawberry=False
        choco=False
    else :
        continue

print(drink_number)