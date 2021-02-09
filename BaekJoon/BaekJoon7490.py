import copy
test_case = int(input())
def recursive(array, n) :
    if len(array)==n :
        operators_list.append(copy.deepcopy(array)) #이차원 리스트
        return
    array.append(' ')
    recursive(array, n)
    array.pop()

    array.append('+')
    recursive(array, n)
    array.pop()

    array.append('-')
    recursive(array, n)
    array.pop()
for _ in range(test_case) :
    operators_list = []
    n = int(input())
    recursive([], n-1)

    integers =[ i for i in range(1, n+1)]

    for operator in operators_list :
        string=""
        for i in range(n-1) :
            string += str(integers[i]) + operator[i]
        string += str(integers[-1])

        if eval(string.replace(" ","")) == 0 :
            print(string)
    print()





