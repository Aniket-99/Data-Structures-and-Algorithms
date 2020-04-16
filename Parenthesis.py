def isValid(expr):
	st = []

	for ch in expr:
		if ch in '({[':
			st.append(ch)
		if ch in ')}]':
			if st == []:
				print("Right parentheses is more than the right parentheses")
				return False 
			else:
				char = st.pop()
				if not matchParentheses(char, ch):
					print("Mismatched parentheses are ",char, " and ",ch)
					return False

	if st == []:
		print("Balanced parentheses")
		return True
	else:
		print("Left parentheses are more than the right parentheses")
		return False


def matchParentheses(leftPar, rightPar):

	if leftPar == '[' and rightPar == ']':
		return True
	
	elif leftPar == '{' and rightPar == '}':
		return True

	elif leftPar == '(' and rightPar == ')':
		return True
	else:
		return False


while True:
	print("Enter an expression with parentheses (Press q to quit): ", end = ' ')
	expression = input()

	if expression == 'q':
		break


	if isValid(expression):
		print("Valid expression")

	else:
		print("Invalid expression")