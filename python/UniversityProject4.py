def modify(String) : #RNA로 변환해주는 함수
    RNA = ''  # RNA로 변환된 염기시퀀스 저장
    for char in String :
        tmp = ''  # 임시 저장변수
        if char=='A' :
            tmp = 'U'
            RNA+=tmp
        elif char=='T' :
            tmp = 'A'
            RNA+=tmp
        elif char=='G' :
            tmp = 'C'
            RNA+=tmp
        elif char=='C' :
            tmp = 'G'
            RNA+=tmp

    return RNA

DNA = "TCAGGGAATTCCTACTTTTGTATTCGCCAG" #DNA 시퀀스

#------------출력----------------
print(modify(DNA)) # RNA변환후 출력


