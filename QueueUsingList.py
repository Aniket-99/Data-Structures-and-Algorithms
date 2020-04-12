class EmptyQueueError(Exception):
	pass


class Queue:
	"""docstring for Queue"""
	def __init__(self):
		self.items = []

	def isEmpty(self):
		return self.items == []

	def size(self):
		return len(self.items)

	def enqueue(self, items):
		self.items.append(items)

	def dequeue(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items.pop(0)

	def peek(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items[0]

	def display(self):
		print(self.items)

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
		