class EmptyTreeError(Exception):
	pass

class Node:
	def __init__(self, value):
		self.info = value
		self.lChild = None
		self.Rchild = None

class BinarySearchTree:
	def __init__(self):
		self.root = None

	def isEmpty(self):
		return self.root == None

	def display(self):
		self._display(self.root,0)
		print()

	def _display(self, p, level):
		if p is None:
			raise EmptyTreeError("Tree is empty")

		self._display(p.Rchild,level+1)
		print()

		for i in range(level):
			print("   ",end="")
		print(p.info)
		self._display(p.lChild, level+1)

	def height(self):
		return self._height(self.root)

	def _height(self,p):
		if p is None:
			return 0

		hL = self._height(p.lChild)
		hR = self._height(p.Rchild)

		if hL > hR:
			return hL + 1
		else:
			return hR + 1


	def preorder(self):
		self._preorder(self.root)
		print()

	def _preorder(self, p):
		if p is None:
			return

		print(p.info," ",end="")
		self._preorder(p.lChild)
		self._preorder(p.Rchild)

	def inorder(self):
		self._inorder(self.root)
		print

	def _inorder(self, p):
		if p is None:
			return

		self._inorder(p.lChild)
		print(p.info," ",end="")
		self._inorder(p.Rchild)


	def postorder(self):
		self._inorder(self.root)
		print

	def _inorder(self, p):
		if p is None:
			return

		self._inorder(p.lChild)
		self._inorder(p.Rchild)
		print(p.info," ",end="")


	def search(self, x):
		return self._search(self.root, x)

	def _search(self, p, x):
		p = self.root

		if p is None:
			return None
		elif x < p.info:
			return self._search(p.lChild, x)
		elif x > p.info:
			return self._search(p.Rchild, x)
		return p



	def searchIterative(self,x):
		p = self.root

		while p is not None:
			if x < p.info:
				p = p.lChild
			elif x > p.info:
				p = p.Rchild
			else:
				return True
		return False

	def minimumIterative(self):
		if self.isEmpty():
			raise EmptyTreeError("Tree is empty")

		p = self.root
		while p.lChild is not None:
			p = p.lChild
		return p.info

	def maximumIterative(self):
		if self.isEmpty():
			raise EmptyTreeError("tree is empty")

		p = self.root
		while p.Rchild is not None:
			p = p.Rchild
		return p.info

	def minimumRecursive(self):
		if self.isEmpty():
			raise EmptyTreeError("Tree is empty")
		return self._minimumRecursive(self.root).info

	def _minimumRecursive(self, p):
		if p.lChild is None:
			return p
		return self._minimumRecursive(p.lChild)

	def maximumRecursive(self):
		if self.isEmpty():
			raise EmptyTreeError("Tree is empty")
		return self._maximumRecursive(self.root).info

	def _maximumRecursive(self, p):
		if p.Rchild is None:
			return p
		return self._maximumRecursive(p.Rchild)

	def insertIteratively(self, x):
		p = self.root
		par = None

		while p is not None:
			par = p
			if x < p.info:
				p = p.lChild
			elif x > p.info:
				p = p.Rchild
			else:
				print(x," is already present in the tree")
				return

		temp = Node(x)

		if par == None:
			self.root = temp
		elif x < par.info:
			par.lChild = temp
		elif x > par.info:
			par.Rchild = temp

	def insertRecursively(self, x):
		self.root = self._insertRecursively(self.root, x)

	def _insertRecursively(self, p, x):
		if p is None:
			p = Node(x)

		elif x < p.info:
			p.lChild = self._insertRecursively(p.lChild,x)

		elif x > p.info:
			p.Rchild = self._insertRecursively(p.Rchild, x)
		else:
			print(x, " is already present in the tree")
		return p



bst = BinarySearchTree()


while True:
	print("1. Display the tree")
	print("2. Search (Iterative)")
	print("3. Search (Recursively)")
	print("4. Insert a new node (Iterative)")
	print("5. Insert a new node (Recursively)")
	print("6. Delete a new node (Iterative)")
	print("7. Delete a new node (Recursively)")
	print("8. Find the minimum key (Iterative)")
	print("9. Find the minimum key (Recursively)")
	print("10. Find the maximum key (Iterative)")
	print("11. Find the maximum key (Recursively)")
	print("12. Preorder Traversal of the tree")
	print("13. Inorder Traversal of the tree")
	print("14. Postorder Traversal of the tree")
	print("15. Height of the tree")
	print("16. Quit")

	choice = int(input("Enter your choice: "))

	if (choice == 1):
		bst.display()
	elif (choice == 2):
		x = int(input("Enter the value to be searched: "))
		bst.searchIterative(x)
	elif (choice == 3):
		x = int(input("Enter the value to be searched: "))
		bst.search(x)
	elif (choice == 4):
		x = int(input("Enter the value to be inserted: "))
		bst.insertIteratively(x)
	elif (choice == 5):
		x = int(input("Enter the value to be inserted: "))
		bst.insertRecursively(x)
	elif (choice == 6):
		pass
	elif (choice == 7):
		pass
	elif (choice == 8):
		result = bst.minimumIterative()
		print(result)
	elif (choice == 9):
		result = bst.minimumRecursive()
		print(result)
	elif (choice == 10):
		result = bst.maximumIterative()
		print(result)
	elif (choice == 11):
		result = bst.maximumRecursive()
		print(result)
	elif (choice == 12):
		bst.preorder()
	elif (choice == 13):
		bst.inorder()
	elif (choice == 14):
		bst.postorder()
	elif (choice == 15):
		x = bst.height()
		print("The height of the tree is",x)
	elif (choice == 16):
		break;
	else:
		print("Invalid choice")

choice = int(input("Enter your choice: "))

