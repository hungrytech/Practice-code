def countfuction(String) : #카운트해주는 함수
    a_count, c_count, g_count, t_count  = 0, 0, 0, 0  #카운트하기위한 변수 생성
    for char in String :
        if char=='a' :
            a_count+=1
        elif char=='c' :
            c_count+=1
        elif char=='g' :
            g_count+=1
        elif char=='t' :
            t_count+=1
    sequence_count.update(a=a_count)
    sequence_count.update(c=c_count)
    sequence_count.update(g=g_count)
    sequence_count.update(t=t_count)
    return sequence_count

sequence = "tagcaaaacccccagtacagcctccagagagcccgttctttgacccacagaataggtccttctgtgtatatggatagtgaaccagcagtaaataaatcctggcgatatactggcaacctgtcaccagtctctgatattgtcagagacagttacggatcacaaaaaactgttgatacagaaaaacttttcgatttagaagcaccagagaaggaaaaacgtacgtcaagggatgtcac"
sequence_count ={} #카운트를 위한 딕셔너리 생성

countfuction(sequence) # argument로 sequence를 넣어주어 함수 실행
#------------출력----------------
print(sequence_count) # 딕셔너리 출력
for key, value in sequence_count.items() : # key값과 value값 출력
    print(key, value)