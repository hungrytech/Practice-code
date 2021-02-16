#이것이 취업을 위한 코딩테스트다 떡볶이 떡 만들기
n, m = map(int, input().split(' '))

data = list(map(int, input().split(' ')))


start = 0
end = max(data)
result=0
while (start <= end) :
    total=0
    rice_len= (start+end)//2
    for i in data :
        if i > rice_len :
            total+= i-rice_len

    if total >= m :
        result = rice_len
        start = rice_len +1

    else :
        end = rice_len -1

print(result)





