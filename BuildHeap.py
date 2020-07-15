'''Building heap using to down approach'''
def build_heap_top_down(array, size):
	for index in range(2, size+1):
		restoreUp(index, array)

def restoreUp(index, array):
	value_at_index = array[index]

	iparent = index // 2

	while array[iparent] < value_at_index:
		array[index] = array[iparent]
		index = iparent
		iparent = index // 2
	array[index] = value_at_index


'''Building heap using to bottom up'''
def build_heap_bottom_up(array, size):
	index = size // 2

	while index >= 1:
		restoreDown(index, array, size)
		index -= 1

def restoreDown(index, array, size):
	value_at_index = array[index]
	lchild = 2 * index
	rchild = lchild + 1

	while rchild <= size:
		if value_at_index >= array[lchild] and value_at_index >= array[rchild]:
			array[index] = value_at_index
			return
		else:
			if value_at_index > array[lchild]:
				array[index] = array[lchild]
				index = lchild

			else:
				array[index] = array[rchild]
				index = rchild

	if lchild == size and value_at_index < array[lchild]:
		array[index] = array[lchild]
		index = lchild

	array[index] = value_at_index

if __name__ == '__main__':
	while True:

		print("1. Build heap using top down approach")
		print("2. Build heap using bottom up approach")

		choice = int(input("Enter your choice"))

		if (choice == 1):
			array1 = [9999]
			max_val = int(input("Enter the range: "))
			for i in range(max_val):
				value = int(input("Enter the elements: "))
				array1.append(value)
			build_heap_top_down(array1,len(array1)-1)

			for i in range(1,len(array1)):
				print(array1[i]," ", end='')
			print()

		elif(choice == 2):
			array2 = [9999]
			max_val = int(input("Enter the range: "))
			for i in range(max_val):
				value = int(input("Enter the elements: "))
				array2.append(value)
			build_heap_bottom_up(array2,len(array2)-1)
			for i in range(1,len(array2)):
				print(array2[i]," ", end='')
			print()






