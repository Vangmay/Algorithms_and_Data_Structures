class Node:
    data = None 
    next_node = None 
    
    def __init__(self,data):
        self.data = data 
        

    def __repr__(self):
        return" %s " %self.data
    

class LinkedList:
    
    def __init__(self):
        self.head = None 
    
    def is_empty(self):
        return self.head == None 
    
    def size(self): 
        current = self.head
        count = 0 
        
        while current : 
            count += 1 
            current = current.next_node 
        return count 

    def add(self,data):
        new_node = Node(data)
        new_node.next_node = self.head
        self.head = new_node 
    
    def __repr__(self,data):
        nodes = []
        current = self.head 

        while current:
            if current is self.head:
                nodes.append("[Head: %s]" % current.data)
            elif current.next_node is None: 
                nodes.append("[Tail %s ]" % current.data)
            else: 
                nodes.append("[%s]" %current.data)

if __name__ == "__main__":
    listt = LinkedList()
    listt.add(1)
    listt.add(2)
    listt.add(3)
    listt.add(4)
    print(listt.head)