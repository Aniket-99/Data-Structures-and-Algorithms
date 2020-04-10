from sys import maxsize

def createStack():
	stack = []
	return stack 

def isEmpty(stack): 	#Checking whether stack is empty or not
	 print(len(stack) == 0)

def push(stack, item):	# Pushing element in the stack
	stack.append(item)
	print(item,"pushed into the stack")

def pop(stack):			# Popping from the stack
	if (isEmpty(stack)):
		print("Stack is empty!")
	print(stack.pop(), "popped from the stack!")

def peek(stack):
	if (isEmpty(stack)):
		print("Stack is empty!")
	print(stack[len(stack)-1], "is the top of the stack")

def reverseStackFunction(stack):		# Reversing a stack
	reverseStack = []
	while (len(stack) != 0):
		temp = stack.pop()
		reverseStack.append(temp)
	print("Reverse of the stack is",reverseStack)
'''
def sortedStack(stack):
	tempStack = createStack()

	while (isEmpty(stack) == False):
		temp = top(stack)
		pop(stack)

		while (isEmpty(tempStack) == False and int(top(tempStack)) < int(temp)):
			push(stack, top(tempStack))
			pop(tempStack)
		push(tempStack, temp)
	return tempStack
'''

stack = createStack()
push(stack, 11)
push(stack, 23)
push(stack, 33)
push(stack, 1)
#pop(stack)
isEmpty(stack)
peek(stack)
print("Original stack is",stack)
reverseStackFunction(stack)
