class Node:
	"""docstring for Node"""
	def __init__(self, data):
		self.data = data
		self.next = None

class LinkedList(object):
	"""docstring for LinkedList"""
	def __init__(self):
		self.head = None
		self.last = None

# ------------Inserting in linked list----------------------------
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
			self.head = new_node
			return
		else:
			last = self.head
			while (last.next):
				last = last.next

			last.next = new_node

# --------------Deleting from Linked list-----------------
	def deleteNode(self, key):
		temp = self.head

		# Checking if the 1st element is the node to be deleted
		if (temp is not None):
			if (temp.data == key):
				self.head = temp.next
				temp = None
				return

		while (temp is not None):
			if (temp.data == key):
				break
			prev = temp
			temp = temp.next

		if temp == None:
			return

		prev.next = temp.next
		temp = None			

#-----------------------------------------------------
# Returning the number of elements in the list
	def getCount(self):
		temp = self.head
		count = 0
		while (temp):
			count+=1
			temp = temp.next
		return count


	def printList(self):
		temp = self.head
		while (temp):
			print(temp.data)
			temp = temp.next
#----------------------------------------------------------
# counting how many time a integer has occured in a linked list
	def getCountOfInteger(self,searchInt):
		current = self.head
		count = 0
		while current is not None:
			if current.data == searchInt:
				count+=1
			current = current.next
		return count
#-----------------------------------------------------------
# Detecting loop in a linked list
	'''def detectLoop(self):
		temp = self.head
		s = set()
		while temp:
			if (temp in s):
				return True
			s.add(temp)
			temp = temp.next
		return False'''
#---------------------------------------------------------------
# Removing duplicates from sorted link list--------
	def removeDuplicates(self):
		temp = self.head
		if temp is None:
			return 
		while temp.next is not None:
			if temp.data == temp.next.data:
				pointer = temp.next.next
				temp.next = None  # delteing the item
				temp.next = pointer	# referencing to the next of the deleted node
			else:
				temp = temp.next
		return self.head
#-----------------------------------------------------------

''' Removing duplicates from unsorted linked list
	def removeDuplicatedFromUnsorted(self,list):
		temp = self.head
		if temp is None:
			return
		while temp:
			data = temp.data
			current = temp.next
			while current:
				if current.data == data:
					list.deleteNode(current)
				current = current.next
			temp = temp.next
'''
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
list.push(4)
list.push(6)
print("created Linked List is ")
list.printList()
list.removeDuplicates()
print("Linked list after deleting duplicates is")
list.printList()

#list.insertAfter(list.head.next,5)
#list.insertAtEnd(90)
#list.push(6)
#list.push(6)
#list.insertAfter(list.head.next, 10)
#list.insertAfter(list.head.next, 11)
#list.insertAfter(list.head.next, 99)
#list.deleteNode(11)
print("The number of times integer is repeated is ",list.getCountOfInteger(6))

print("created linked list is: ")
list.printList()
print("Count of linked list is: ",list.getCount())

#print("Total number of elements in the list is: "+list.count())


		
		