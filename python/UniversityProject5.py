sequence1 = "ACTA"
sequence2 = "AGT"
sequence3 = "CGGT"

sequence1Set = set(sequence1) #Set을 이용하여 증복인 A를 제거
sequencelist_1 = list(sequence1Set) #Set을 정렬을 위해 list로 변환
sequencelist_1.sort() # 리스트 오름차순 정렬

sequence3Set = set(sequence3) #Set을 이용하여 증복인 G를 제거
sequencelist_3 = list(sequence3Set) #Set을 정렬을 위해 list로 변환
sequencelist_3.sort() # 리스트 오름차순 정렬

solutionList1 = list() #출력할 리스트 생성

# for문으로 작성
for s1 in sequencelist_1 :
    for s2 in sequence2 :
       for s3 in sequencelist_3 :
            tmp = s1+s2+s3 #임시값 저장
            solutionList1.append(tmp)

#------------출력----------------
print("for문 작성=", solutionList1) #시퀸스 출력

# 리스트 컴프리션으로 코드 작성
solutionList2 = [s1+s2+s3 for s1 in sequencelist_1
                 for s2 in sequence2 for s3 in sequencelist_3]

#------------출력----------------
print("리스트 컴프리헨션 작성=", solutionList2) #시퀸스 출력