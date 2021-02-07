import sys


data = sys.stdin.readline().rstrip()

search_data = sys.stdin.readline().rstrip()
length = len(search_data)
index =0

count = 0
while index < len(data) :
    find_index= data.find(search_data,index)
    if find_index != -1 :
        index = length + find_index
        count+=1
    elif find_index== -1 :
        break;
print(count)