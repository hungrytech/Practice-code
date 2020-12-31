class Node :
    def __init__(self, data):
        self.data = data
        self.next = None

    def __init__(self, data, next=None):
        self.data=data
        self.next=next

def add(data) :
    node=head
    while node.next :
        node=node.next
    node.next=Node(data)

node1=Node(1)
node2=Node(2)
node3=Node(3)
node1.next=node2
node2.next=node3
head=node1

add(5)
add(6)
print(node3.next.next.data) #값이 6나온다

