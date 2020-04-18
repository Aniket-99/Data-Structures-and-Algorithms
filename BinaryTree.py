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


	def preorder(self):
		self._preorder(self.root)
		print()

	def _preorder(self, p):
		if p is None:
			return
		print(p.info," ",end="")
		self._preorder(p.lChild)
		self._preorder(p.RChild)

	def inorder(self):
		self._inorder(self.root)
		print()

	def _inorder(self, p):
		if p is None:
			return
		self._inorder(p.lChild)
		print(p.info," ",end="")
		self._inorder(p.RChild)

	def postorder(self):
		self._postorder(self.root)
		print()

	def _postorder(self, p):
		if p is None:
			return
		self._postorder(p.lChild)
		self._preorder(p.RChild)
		print(p.info," ",end="")

	def levelorder(self):
		if self.root is None:
			print("Tree is empty")
			return

		qu = deque()
		qu.append(self.root)

		while len(qu)!=0:
			p = qu.popleft()
			print(p.info," ",end="")
			if p.lChild is not None:
				qu.append(p.lChild)
			if p.RChild is not None:
				qu.append(p.RChild)
			#print(self.root.info)
			#print(self.root.lChild.info)
			#print(self.root.RChild.info)


	def createTree(self):
		self.root = Node('P')
		self.root.lChild = Node('Q')
		self.root.RChild = Node('R')
		self.root.lChild.lChild = Node('A')
		self.root.lChild.RChild = Node('B')
		self.root.RChild.lChild = Node('X')



bt = BinaryTree()

bt.createTree()
bt.display()
print()

height = bt.heightOfTree()
print("The height of the tree is: ",height)

print("The preorder traversal of the tree is: ")
bt.preorder()

print("The Inorder traversal of the tree is: ")
bt.inorder()

print("The post order traversal of the tree is: ")
bt.postorder()

print("The level order traversal of the tree is: ")
bt.levelorder()