class Node:
	"""docstring for Node"""
	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList(object):
	"""docstring for LinkedList"""
	def __init__(self):
		self.head = None

	def push(self, new_data):
		new_node = Node(new_data)
		new_node.next = self.head
		self.head = new_node

	def printList(self):
		temp = self.head
		while (temp):
			print(temp.data)
			temp = temp.next



if __name__== '__main__':
	list  = LinkedList() # creating object


	list.push(2)
	list.push(4)
	list.push(9)

	print("created linked list is: ")
	list.printList()


		
		