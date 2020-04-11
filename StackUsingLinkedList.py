class EmptyStackError(Exception):
	pass


class Node:
	def __init__(self, data):
		self.data = data
		self.next = None

class Stack:

	def __init__(self):
		self.head = None

	def isEmpty(self):
		return self.head == None

	def size(self):
		if self.isEmpty():
			return 0

		count = 0
		temp = self.head
		while temp is not None:
			count+=1
			temp = temp.next
		return count

	def push(self, data):
		new_node = Node(data)
		new_node.next = self.head
		self.head = new_node
		print(new_node.data,"Pushed into the stack List")


	def pop(self):
		if self.isEmpty():
			raise EmptyStackError("Stack is empty")

		popped = self.head.data
		self.head = self.head.next
		return popped

	def peek(self):
		if self.isEmpty():
			raise EmptyStackError("Stack is empty")

		return self.head.data



	def printList(self):
		temp = self.head
		while temp is not None:
			print(temp.data)
			temp = temp.next


'''
stackList = Stack()

stackList.push(10)
stackList.push(20)
print("The original list is")
stackList.printList()
total = stackList.size()
print("The size of the stack list is",total)
z = stackList.pop()
print("Popped element is",z)
count = stackList.size()
print("Size of list after popping operation is",count)

top = stackList.peek()
print("The top of the list is",top)
'''

if __name__ == '__main__':
	stackList = Stack()

	while True:
		print("1. Push")
		print("2. Pop")
		print("3. Size")
		print("4. Peek")
		print("5. Display")
		print("6.Quit")

		choice = int(input("Enter your choice: "))

		if (choice == 1):
			value = int(input("Enter an element: "))
			stackList.push(value)
		elif (choice == 2):
			pop = stackList.pop()
			print("The popped element is",pop)
		elif (choice == 3):
			total = stackList.size()
			print("The size of the stack list is",total)
		elif (choice == 4):
			top = stackList.peek()
			print(top)
		elif (choice == 5):
			stackList.printList()
		elif (choice == 6):
			break;
		else:
			print("Choose a correct option")
		print()











