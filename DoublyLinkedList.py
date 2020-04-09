class Node(object):
	"""docstring for Node"""
	def __init__(self, data):
		self.data = data
		self.next = None
		self.prev = None

class DoublyLinkedList(object):
	"""docstring for DoublyLinkedList"""
	def __init__(self):
		self.head = None

# Inserting a node at start--------
	def Push(self, new_data):
		new_node = Node(new_data)

		new_node.next = self.head

		if self.head is not None:
			self.head.prev = new_node
		self.head = new_node

# Deleting a element in doubly linked list
	def deleteNode(self, dele):
		if self.head is None or dele is None: # If linked list is empty
			return

		

		if self.head == dele:	# If the node to be deleted is first node
			self.head = dele.next

		if dele.next is not None:
			dele.next.prev = dele.prev

		if dele.prev is not None:
			dele.prev.next = dele.next
			


	def printList(self):
		temp = self.head
		print("Traversal in forward direction: ")
		while (temp is not None):
			print("%d" %(temp.data))
			last = temp
			temp = temp.next
		
		
llist = DoublyLinkedList()

llist.Push(10)
llist.Push(20)
llist.Push(5)
llist.Push(6)
llist.deleteNode(llist.head)
llist.printList()