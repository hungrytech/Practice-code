n = int(input())

list_data=[0]*1000000
list_data[0]=1
list_data[1]=2
for i in range(n-2) :
    list_data[i+2]= (list_data[i] + list_data[i+1]) %15746

print(list_data[n-1])

