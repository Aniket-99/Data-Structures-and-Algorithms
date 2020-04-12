class EmptyQueueError(Exception):
	pass

class Queue:
	def __init__(self, default_size = 2):
		self.items = [None] * default_size
		self.front = 0
		self.count = 0


	def isEmpty(self):
		return self.count == 0

	def size(self):
		return self.count

	def enqueue(self, items):
		if self.count == len(self.items):
			self.resize(2 * len(self.items))

		i = (self.count + self.front) % len(self.items)
		self.items[i] = items
		self.count+=1

	def dequeue(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")

		x = self.items[self.front]
		self.items[self.front] = None
		self.front = (self.front + 1) % len(self.items)
		self.count -= 1
		return x

	def peek(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")

		return self.items[self.front]

	def display(self):
		print(self.items)

	def resize(self, newsize):
			oldList = self.items
			self.items = [None] * newsize
			i = self.front
			for j in range(self.count):
				self.items[j] = oldList[i]
				i = (1 + i) % len(oldList)
			self.front = 0



if __name__ == '__main__':
	queue = Queue()

	while True:
		print("1. Enqueue")
		print("2. Dequeue")
		print("3. Size")
		print("4. Peek")
		print("5. Display")
		print("6.Quit")

		choice = int(input("Enter your choice: "))

		if (choice == 1):
			value = int(input("Enter the element: "))
			queue.enqueue(value)

		elif (choice == 2):
			value = queue.dequeue()
			print(value, "is deleted from the queue")

		elif (choice == 3):
			size = queue.size()
			print("The size of the queue is", size)

		elif (choice == 4):
			top = queue.peek()
			print("The top of the queue is", top)

		elif (choice == 5):
			queue.display()

		elif (choice == 6):
			break;

		else:
			print("Error!! please enter correct choice!")

		print()
		


