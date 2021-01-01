class Node :
    def __init__(self,data ):
        self.data=data
        self.prv=None
        self.next=None

    def __init__(self, data, prv=None, next=None):
        self.data = data
        self.prv = None
        self.next = None

class NodeMgmt :
    def __init__(self,data):
        self.head = Node(data)
        self.tail = self.head
    def add(self, data):
        if self.head=='': # 헤드에 아무것도 없을 시 생성 후 헤드로 설정
            self.head=Node(data)
            self.tail=self.head
            return
        else :
            node=self.head
            while node.next :
                node=node.next

            node.next=Node(data)
            node.next.prv=node # 앞에 노드와 포인트 연결
            self.tail=node.next # tail을 다시 설정

    def insert_before(self, data, beforedata): #뒤로 검색하여 찾은 노드앞에 삽입
        node=self.tail
        while node.data!=beforedata  :
            if node==None :
                return False
            else:
                node=node.prv
        # 삽입해줄 노드의 포인터 연결
        new=Node(data)
        new.next= node
        new.prv=node.prv
        # 기존노드들 포인트 연결
        node.prv.next=new
        node.prv=new
        return True

    def insert_after(self, data, afterdata): #앞에서 부터 검색하여 찾은 노드뒤에 삽입

        node = self.head
        while node.data!=afterdata :
            if node==None :
                return False
            else :
                node=node.next
        # 새 노드를 양옆 노드와 포인트연결
        new = Node(data)
        new.prv = node
        new.next= node.next
        # 기존 노드와 새 노드와 포인트 연결
        node.next=new
        node.next.prv=new
        return True

    def desc(self): # 현재 연결되있는 모든 노드 확인
        node = self.head
        while node :
            print(node.data, end=' ')
            node=node.next



# 출력 확인
doubleLinked=NodeMgmt(1)
doubleLinked.add(2)
doubleLinked.add(3)
doubleLinked.add(4)
doubleLinked.insert_before(2.5, 3)
doubleLinked.insert_after(3.5,3)
doubleLinked.desc()
# 1, 2, 2.5, 3, 3.5, 4






