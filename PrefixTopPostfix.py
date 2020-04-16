from StackUsingLinkedList import Stack # importing the stackUsingLinkedList file

# Converision from infix to postfix expression
def infixToPostfix(infix):
	postfix = ""

	st = Stack()

	for symbol in infix:
		if symbol == ' ' or symbol == "\t":
			continue

		if 	symbol == '(':
			st.push(symbol)
		elif symbol == ')':
			next = st.pop()

			while next != '(':
				postfix = postfix + next
				next = st.pop()

		elif symbol in "+-*/%^":
			while not st.isEmpty() and precedence(st.peek()) >= precedence(symbol):
				postfix = postfix + st.pop()
			st.push(symbol)

		else:
			postfix = postfix + symbol

	while not st.isEmpty():
		postfix = postfix + st.pop()
	return postfix

def precedence(symbol):

	if symbol == '(':
		return 0
	elif symbol == '+-':
		return 1
	elif symbol == '*/%':
		return 2
	elif symbol == '^':
		return 3
	else:
		return 0

# evaluation of the postfix expression
def evaluatePostfix(postfix):

	st = Stack()

	for symbol in postfix:	# Loop and if operand is found push into the stack 

		if symbol.isdigit():
			st.push(int(symbol))
		else:
			x = st.pop()     # If operator found pop two operand from the stack and apply the operator
			y = st.pop()

			if symbol == '+':
				st.push(y + x)
			elif symbol == '-':
				st.push(y - x)
			elif symbol == '*':
				st.push(y * x)
			elif symbol == '/':
				st.push(y / x)
			elif symbol == '%':
				st.push(y % x)
			elif symbol == '^':
				st.push(y ** x)
	
	return st.pop()			# Finally pop the last element which is the answer and return it

while True:
	print("Enter an expression with parentheses (Press q to quit): ", end = ' ')
	expression = input()

	if expression == 'q':
		break

	postfix = infixToPostfix(expression)
	print("Postfix expression is : ", postfix)
	print("Evaluation of the postfix expression is: ",evaluatePostfix(postfix))

				
