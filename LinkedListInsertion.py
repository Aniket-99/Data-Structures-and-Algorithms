class Node:
	"""docstring for Node"""
	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList(object):
	"""docstring for LinkedList"""
	def __init__(self):
		self.head = None


	# Adding a node at the start
	def push(self, new_data):
		new_node = Node(new_data)
		new_node.next = self.head
		self.head = new_node

	def insertAfter(self, prev_node, new_data):
		# Checking is previous node is there in the list
		if prev_node is None:
			print("The previous node is not in the linked list")
			return

		new_node = Node(new_data)
		new_node.next = prev_node.next
		prev_node.next = new_node

	# Inserting an intem at the end of linked list
	def insertAtEnd(self, new_data):

		new_node = Node(new_data)

		# checking if there is already an item in the linked list, if not then make the input element as the head
		if self.head is None:
			new_node = self.head
			return
		else:
			last = self.head
			while (last.next):
				last = last.next

			last.next = new_node


	def printList(self):
		temp = self.head
		while (temp):
			print(temp.data)
			temp = temp.next



if __name__== '__main__':
	list  = LinkedList() # creating object

'''
print("1.Push\n 2. Insert After element\n 3. Insert At the end of list\n 4.Print the list")
choice = int(input("Enter your choice: "))
while choice is not 6:
	if choice == '1':
		value = int(input("Enter the element: "))
		list.push(value)
	elif choice == '2':
		value = int(input("Enter the element: "))
		list.insertAfter(list.head.next, value)
	elif choice == '3':
		value = int(input("Enter the element: "))
		list.insertAtEnd(value)
	elif choice == '4':
		print("Linked list is: ")
		list.printList()
	choice = int(input("Enter your choice: "))
'''


list.push(2)
list.push(4)
list.push(9)
list.insertAfter(list.head.next,5)
list.insertAtEnd(90)
list.push(6)
list.insertAfter(list.head.next, 10)
list.insertAfter(list.head.next, 11)


print("created linked list is: ")
list.printList()


		
		