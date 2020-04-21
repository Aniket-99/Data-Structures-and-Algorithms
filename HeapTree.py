class HeapEmptyError(Exception):
	pass

class Heap:

	def __init__(self, maxsize = 10):
		self.a = [None] * maxsize
		self.n = 0
		self.a[0] = 9999


	def insert(self, value):
		self.n += 1
		self.a[self.n] = value
		self.restoreUp(self.n)

	def restoreUp(self, i):
		k = self.a[i]
		indexParent = i // 2

		while self.a[indexParent] < k:
			self.a[i] = self.a[indexParent]
			i = indexParent
			indexParent = i // 2
		self.a[i] = k

	def delete(self):
		if self.n == 0:
			raise HeapEmptyError("Heap tree is empty")

		maxValue = self.a[1]
		self.a[1] = self.a[self.n]
		self.n -= 1
		self.restoreDown(1)
		return maxValue


	def restoreDown(self, i):
		k = self.a[i]
		lChild = 2 * i
		rChild = lChild + 1

		while rChild <= self.n:
			if k >= self.a[lChild] and k >= self.a[rChild]:
				self.a[i] = k
				return
			else:
				if self.a[lChild] > self.a[rChild]:
					self.a[i] = self.a[lChild]
					i = lChild
				else:
					self.a[i] = self.a[rChild]
					i = rChild

			lChild = 2 * i
			rChild = lChild + 1


		# if no of nodes is even

		if lChild == self.n and k < self.a[lChild]:
			self.a[i] = self.a[lChild]
			i = lChild
		self.a[i] = k

	def display(self):
		if self.n == 0:
			raise HeapEmptyError("Heap tree is empty")
			return
		print("Heap size is: ", self.n)
		for i in range(1, self.n + 1):
			print(self.a[i]," ", end = " ")
		print()


heap = Heap()

while True:
	print("1. Insert")
	print("2. Delete root element")
	print("3. Display")
	print("4. Exit")

	choice = int(input("Enter your choice: "))

	if choice == 1:
		value = int(input("Enter the value to be inserted: "))
		heap.insert(value)
	elif choice == 2:
		print("Maximum value is: ", heap.delete())
	elif choice == 3:
		heap.display()
	elif choice == 4:
		break
	else:
		print("Invalid choice")
choice = int(input("Enter your choice: "))


