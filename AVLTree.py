class AVLTreeNode:
	def __init__(self, val):
		self.val = val
		self.left = None
		self.right = None
		self.height = 1

class AVLTree:

	def insert(self, root, key):

		if root is None:
			return AVLTreeNode(key)
		elif key < root.val:
			root.left = self.insert(root.left, key)
		else:
			root.right = self.insert(root.right, key)


		root.height = 1 + max(self.getHeight(root.left), self.getHeight(root.right))
		balance = self.getBalance(root)

		
		if balance > 1 and key < root.left.val:# Left Left 
			return self.rightRotate(root)
		elif balance < -1 and key > root.right.val:# Right Right
			return self.leftRotate(root)
		elif balance > 1 and key > root.left.val:	# Left Right
			root.left = self.leftRotate(root.left)
			return self.rightRotate(root)
		elif balance < -1 and key < root.right.val: # Right Left
			root.right = self.rightRotate(root.right)
			return self.leftRotate(root)

		return root


	def leftRotate(self, root):
		temp1 = root.right
		temp2 = temp1.left

		# Performing Rotation
		temp1.left = root
		root.right = temp2

		root.height = 1 + max(self.getHeight(root.left), self.getHeight(root.right))
		temp1.height = 1 + max(self.getHeight(temp1.left), self.getHeight(temp1.right))

		return temp1

	def rightRotate(self, root):
		temp1 = root.left
		temp2 = temp1.right

		temp1.right = root
		root.left = temp2

		root.height = 1 + max(self.getHeight(root.left), self.getHeight(root.right))
		temp1.height = 1 + max(self.getHeight(temp1.left), self.getHeight(temp1.right))

		return temp1

	def getHeight(self, root):
		if root is None:
			return 0

		return root.height

	def getBalance(self, root):
		if root is None:
			return 0

		return self.getHeight(root.left) - self.getHeight(root.right)

	def preOrder(self, root):
		if not root:
			return
		print("{0} ".format(root.val), end="")
		self.preOrder(root.left)
		self.preOrder(root.right) 

if __name__ == '__main__':
	avlTree = AVLTree()
	root = None
	root = avlTree.insert(root, 50) 
	root = avlTree.insert(root, 10) 
	root = avlTree.insert(root, 60) 
	root = avlTree.insert(root, 20) 
	root = avlTree.insert(root, 22) 
	root = avlTree.insert(root, 15) 

	print("Preorder traversal of the AVL tree is") 
	avlTree.preOrder(root) 
