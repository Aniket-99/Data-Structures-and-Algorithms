class EmptyQueueError(Exception):
	pass

class Node:
	def __init__(self, value, pr):
		self.info = value
		self.priority = pr
		self.link = None

class PriorityQueue:

	def __init__(self):
		self.front = None

	def enqueue(self,data,dataPriority):
		temp = Node(data, dataPriority)
		if self.isEmpty() or dataPriority < self.front.priority:
			temp.link = self.front
			self.front = temp
		else:
			p = self.front
			while p.link is not None and p.link.priority <= dataPriority:
				p = p.link
			temp.link = p.link
			p.link = temp

	def dequeue(self):

		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")

		x = self.front.info
		self.front = self.front.link
		return x 


	def isEmpty(self):
		return self.front == None

	def display(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
			return

		print("Queue is: ")
		p = self.front
		while p is not None:
			print("Data: ",p.info,"   ","Priority:", p.priority)
			p = p.link
		print()


	def size(self):
		if self.isEmpty():
			raise EmptyQueueError("Queue is empty")
		count = 0
		p = self.front
		while p is not None:
			count+=1
			p = p.link
		return count


if __name__ == '__main__':
	priorityQueue = PriorityQueue()

	while True:
		print("1. Enqueue")
		print("2. Dequeue")
		print("3. Size")
		print("4. Display")
		print("5.Quit")

		choice = int(input("Enter your choice: "))

		if (choice == 1):
			value = int(input("Enter an element: "))
			priority = int(input("Enter the priority: "))
			priorityQueue.enqueue(value, priority)
		elif (choice == 2):
			pop = priorityQueue.dequeue()
			print("The popped element is",pop)
		elif (choice == 3):
			total = priorityQueue.size()
			print("The size of the stack list is",total)
		elif (choice == 4):
			priorityQueue.display()
		elif (choice == 5):
			break;
		else:
			print("Choose a correct option")
		print()






