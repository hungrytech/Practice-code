def slice (String) : # ACG로 시작하고 TAT로 종결되는 슬라이싱 함수
    start_ACG=String.find('ACG') #ACG가 시작하는 index
    start_TAT=String.find('TAT') #TAT가 시작하는 index
    slice_String = String[start_ACG:start_TAT+3] #ACG시작하는 index 부터 TAT가 끝나는 index까지 slicing
    return slice_String

sequence="TACTAAAACGGCCCTTGGGAACCTATAAAGGCAATATGCAGTAG"

#---------출력---------
print(slice(sequence)) #slicing한 결과값 출력
