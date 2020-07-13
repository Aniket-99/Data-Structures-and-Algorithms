class HeapTreeEmptyError(Exception):
	pass

'''This is an example of max heap'''
class Heap:
	def __init__(self,maxsize = 10):
		self.array = [None] * maxsize;
		self.index = 0;
		self.array[0] = 9999

	'''This function is used to insert at the heap tree and it internally uses another function which is 
	restore up for checking'''

	def insert(self, value):
		self.index += 1
		self.array[self.index] = value
		self.restoreUp(self.index) # pass the index value to check

	def restoreUp(self, index):
		value_at_index = self.array[index] # Get the value at the index and store it in variable

		iparent = index // 2 # Perform this to find the parent of the current value at index

		while self.array[iparent] < value_at_index: # Loop while the value at the parent index is less than the current index
			self.array[index] = self.array[iparent] # Swap the value
			index = iparent	# assign value to index
			iparent = index // 2	# Find again the parent index and let the loop to continue
		self.array[index] = value_at_index	# finally assign the value

	'''This is for deleting value at root node'''

	def delete_root(self):
		if self.index == 0:
			raise HeapTreeEmptyError("Tree is empty")

		max_value = self.array[1]
		self.array[1] = self.array[self.index]
		self.index -= 1
		self.restoreDown(1)
		return max_value

	def restoreDown(self,index):
		k = self.array[index]
		lchild = 2 * index
		rchild = lchild + 1

		while rchild <= self.index:
			if self.array[lchild] <= k and self.array[rchild] <= k:
				self.array[index] = k
				return

			else:
				if self.array[lchild] > k:
					self.array[index] = self.array[lchild]
					index = lchild
				else:
					self.array[index] = self.array[rchild]
					index = rchild

			lchild = 2 * index
			rchild = rchild + 1

		# If number of nodes is even

		if lchild == self.index and k < self.array[lchild]:
			self.array[index] = self.array[lchild]
		self.array[index] = k

	def display(self):
		if self.index == 0:
			print("Tree is empty")
			return
		print("Heap size is: ", self.index)
		for i in range(1, self.index + 1):
			print(self.array[i], " ",end=" ")
		print()

if __name__ == '__main__':
	h = Heap()

	while True:
		print('1:Insert')
		print('2:Delete root node')
		print('3:Display')
		print("4: Exit")
		choice = int(input("Enter your choice: "))

		if (choice == 1):
			value = int(input("Enter the value: "))
			h.insert(value)

		elif (choice == 2):
			value = h.delete_root()
			print("Maximum value is: ", value)

		elif (choice == 3):
			h.display()
			break
		else:
			print("Wrong choice")










