from collections import deque

class Node:
	def __init__(self, value):
		self.info = value
		self.lChild = None
		self.RChild = None

class BinaryTree:
	def __init__(self):
		self.root = None

	def isEmpty(self):
		return self.root == None

	def display(self):
		self._display(self.root,0)
		print()

	def _display(self,p,level):
		if p is None:
			return
		self._display(p.RChild,level+1)
		print()

		for i in range(level):
			print("    ",end='')
		print(p.info)
		self._display(p.lChild,level+1)

	def heightOfTree(self):
		return self._height(self.root)

	def _height(self,p):
		if p is None:
			return 0

		hL = self._height(p.lChild)
		hR = self._height(p.RChild)

		if hL > hR:
			return hL + 1
		else:
			return hR + 1


	def createTree(self):
		self.root = Node('P')
		self.root.lChild = Node('Q')
		self.root.RChild = Node('R')
		self.root.lChild.lChild = Node('A')
		self.root.lChild.RChild = Node('B')
		self.root.RChild.lChild = Node('x')



bt = BinaryTree()

bt.createTree()
bt.display()
print()

height = bt.heightOfTree()
print("The height of the tree is: ",height)

