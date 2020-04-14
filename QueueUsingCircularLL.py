class EmptyQueueError(Exception):
	pass

class Node:

	def __init__(self, value):
		self.info = value
		self.link = None

class Queue:

	def __init__(self):
		self.rear = None

	def isEmpty(self):
		return self.rear == None

	def size(self):
		if self.isEmpty():
			return 0
		else:
			count = 0
			temp = self.rear.link
			while True:
				count+=1
				temp = temp.link
				if temp == self.rear.link:
					break
			return count

	def enqueue(self, data):
		temp = Node(data)

		if self.isEmpty():
			self.rear = temp
			self.rear.link = temp.link
		else:
			temp.link = self.rear.link
			self.rear.link = temp
			self.rear = temp

	def dequeue(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		
		if self.rear.link == self.rear:
		 	temp = self.rear
		 	self.rear = None
		else:
		 	temp = self.rear.link
		 	self.rear.link = self.rear.link.link
		return temp.info

	def peek(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		else:
			temp = self.rear.link.info
		return temp

	def display(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
			return
		p = self.rear.link
		while True:
			print(p.info)
			p = p.link
			if p == self.rear.link:
				break
		print()


if __name__ == '__main__':
	circularQueueLL = Queue()

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
			circularQueueLL.enqueue(value)
		elif (choice == 2):
			pop = circularQueueLL.dequeue()
			print("The popped element is",pop)
		elif (choice == 3):
			total = circularQueueLL.size()
			print("The size of the stack list is",total)
		elif (choice == 4):
			top = circularQueueLL.peek()
			print(top)
		elif (choice == 5):
			circularQueueLL.display()
		elif (choice == 6):
			break;
		else:
			print("Choose a correct option")
		print()

