s1 = 'caatttgata'
s2 = 'attaggttac'
s3 = 'attccttttt'

for x,y,z in zip(s1, s2, s3):
    tmp = x+y+z #각 리스트에서 가져온 값들을 join
    print(tmp)
