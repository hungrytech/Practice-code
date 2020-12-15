aminoacid_list = ['His', 'Phe', 'Tyr', 'Leu', 'Met'] #아미노산 리스트

input_word = input("문자를 입력하시오") # 문자 입력

for i in aminoacid_list :
    if i.startswith(input_word)==True : #입력한 문자와 시작하는 문자가 같은지 확인
        print("일치하는 문자열은\n",i, "입니다")
    elif i.startswith(input_word.upper())==True : # 입력한 문자가 소문자일시 대문자로 변환하여 비교
        print("일치하는 문자열은\n",i, "입니다")