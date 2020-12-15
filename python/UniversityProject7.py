stdNumber_name = {"20198800":"KIM H.G.", # 학번과 이름 딕셔너리
               "20199906":"SONG D.G.",
               "20198801":"LEE S.Y.",
               "20198934":"TAE J.A.",
               "20198903":"PARK C.H."}

name_address = {"KIM H.G.":"seoul", # 이름과 주소 딕셔너리
                "SONG D.G.":"daegu",
                "LEE S.Y.":"pusan",
                "TAE J.A.":"sokcho",
                "PARK C.H.":"incheon"}

adress_carNumber = {"seoul": "23AH6780", # 주소와 차번호 딕셔너리
                    "daegu":"78EF1204",
                    "pusan":"49MA4582",
                    "sokcho":"82NA9035",
                    "incheon":"99TM8023"}

stdNumber_input = input("학번을 입력하시오") #입력받은 학번
search_input = input("검색정보 (n-이름, a-주소, c-차 번호):") #입력받은 검색정보

def search (stdNumber_input, search_input) : #정보검색 함수
    result = "null" # 검색한 결과를 반환하는 변수

    if search_input=='n' :
        count = 0 #해당 key값의 index 번호를 알기위한 count
        for i in stdNumber_name.keys(): #학번에 맞는 이름 key값 검색
            count += 1
            if stdNumber_input in i:
                break
        index= count -1 #해당 인덱스 값
        result = list(stdNumber_name.values())[index]  #해당 학번의 이름 정보

    elif search_input=='a' :
        count = 0  #해당 key값의 index 번호를 알기위한 count
        for i in stdNumber_name.keys(): #학번에 맞는 이름 key값 검색
            count += 1
            if stdNumber_input in i:
                break
        index = count -1  # 해당 인덱스 값
        name_tmp = list(stdNumber_name.values())[index] #임시 해당학번의 이름 변수
        count = 0 # 카운트 초기화
        index = 0 # 인덱스 초기화
        for i in name_address.keys() : #이름에 맞는 주소 key값 검색
            count += 1
            if name_tmp in i :
                break
        index = count -1
        result = list(name_address.values())[index] #해당 이름의 주소 정보


    elif search_input=='c' :
        count = 0  #해당 key값의 index 번호를 알기위한 count
        for i in stdNumber_name.keys(): #학번에 맞는 이름 key값 검색
            count += 1
            if stdNumber_input in i:
                break
        index = count -1  # 해당 인덱스 값
        name_tmp = list(stdNumber_name.values())[index]  # 임시 해당학번의 이름 변수
        count = 0  # 카운트 초기화
        index = 0  # 인덱스 초기화
        for i in name_address.keys(): #이름에 맞는 주소 key값 검색
            count += 1
            if name_tmp in i:
                break
        index = count -1
        adress_tmp = list(name_address.values())[index] #임시 해당이름의 주소 변수
        count = 0 # 카운트 초기화
        index = 0  # 인덱스 초기화
        for i in adress_carNumber.keys() : #주소에 맞는 차번호 key값 검색
            count += 1
            if adress_tmp in i :
                break
        index = count -1
        result = list(adress_carNumber.values())[index] #해당 주소의 차번호 정보


    return result


#-------- 출력 ------------
print(search(stdNumber_input,search_input))
