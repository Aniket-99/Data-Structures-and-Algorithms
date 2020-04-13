class EmptyQueueError(Exception):
	pass

class Node:
	def __init__(self, value):
		self.info = value
		self.link = None

class Queue:
	"""docstring for Queue"""
	def __init__(self):
		self.front = None
		self.rear = None
		self.size_queue = 0

	def isEmpty(self):
		return self.front == None

	def size(self):
		return self.size_queue

	def enqueue(self, data):
		temp = Node(data)

		if self.front == None:
			self.front = temp
		else:
			self.rear.link = temp
		self.rear = temp
		self.size_queue+=1

	def dequeue(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty!!")
		else:
			x = self.front.info
			self.front = self.front.link
			self.size_queue-=1
			return x

	def peek(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		x = self.front.info
		return x

	def  display(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		else:
			print("Queue is")
			temp = self.front
			while temp is not None:
				print(temp.info, end=" ")
				temp = temp.link
			print()


if __name__ == '__main__':
	queueList = Queue()

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
			queueList.enqueue(value)
		elif (choice == 2):
			pop = queueList.dequeue()
			print("The popped element is",pop)
		elif (choice == 3):
			total = queueList.size()
			print("The size of the Queue list is",total)
		elif (choice == 4):
			top = queueList.peek()
			print("The top of the queue is",top)
		elif (choice == 5):
			queueList.display()
		elif (choice == 6):
			break;
		else:
			print("Choose a correct option")
		print()
		

		