class EmptyQueueError(Exception):
	pass

class Dequeue(object):
	"""docstring for Dequeue"""
	def __init__(self):
		self.items = []

	def isEmpty(self):
		return self.items == []

	def size(self):
		return len(self.items)

	def insertAtFront(self, data):
		self.items.insert(0,data)

	def insertAtEnd(self,data):
		self.items.append(data)

	def deleteAtFront(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items.pop(0)

	def deleteAtEnd(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items.pop() 

	def first(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items[0]

	def last(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		return self.items[len(self.items)-1]
	
	def display(self):
		print(self.items)


if __name__ == '__main__':
	dequeue = Dequeue()

	while True:
		print("1. Insert at the front end")
		print("2. Insert at the rear end")
		print("3. Delete at the front end")
		print("4. Delete at the rear end")
		print("5. Display the first element")
		print("6. Display the last element")
		print("7. Display")
		print("8. Size")
		print("9. Quit")

		choice = int(input("Enter your choice: "))

		if (choice == 1):
			value = int(input("Enter an element: "))
			dequeue.insertAtFront(value)
		elif (choice == 2):
			value = int(input("Enter an element: "))
			dequeue.insertAtEnd(value)
		elif (choice == 3):
			value = dequeue.deleteAtFront()
			print("The deleted element is",value)
		elif (choice == 4):
			value = dequeue.deleteAtEnd()
			print("The deleted element is",value)
		elif (choice == 5):
			value = dequeue.first()
			print("The first element is",value)
		elif (choice == 6):
			value = dequeue.last()
			print("The last element is", value)
		elif (choice == 7):
			dequeue.display()
		elif (choice == 8):
			size = dequeue.size()
			print("The size of the queue is",size)
		elif (choice == 9):
			break;
		else:
			print("Choose a correct option")
		print()

