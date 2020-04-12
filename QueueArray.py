class EmptyQueueError(Exception):
	pass

## This implementation is ineffcient if list is large and there is frequent enqueue and dequeue operation
class Queue:

	def __init__(self):
		self.items = []
		self.front = 0

	def isEmpty(self):
		return self.front == len(self.items)

	def size(self):
		return len(self.items) - self.front

	def enqueue(self, items):
		self.items.append(items)

	def dequeue(self):
		if self.isEmpty():
			raise Empty QueueError("Queue is empty")

		x = self.items[self.front]
		self.items[self.front] = None
		self.front += 1
		return x

	def peek(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")

		return self.items[self.front]

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
		
