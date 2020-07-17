# Time complexity: O(nlogn)
# n for building heap tree and logn for sorting
# space complexity: O(1)

def heapSort(array, size_of_array):
	build_heap_bottom_up(array,size_of_array)

	while size_of_array > 1:
		max_val = array[1]
		array[1] = array[size_of_array]
		array[size_of_array] = max_val
		size_of_array = size_of_array - 1
		restoreDown(1,array,size_of_array)

def build_heap_bottom_up(array, size_of_array):
	index = size_of_array//2
	while index >= 1:
		restoreDown(index, array, size_of_array)
		index = index - 1

def restoreDown(index, array, size_of_array):
	value_at_index = array[index]
	lchild = 2 * index
	rchild = lchild + 1

	while rchild <= size_of_array:
		if value_at_index >= array[lchild] and value_at_index >= array[rchild]:
			array[index] = value_at_index
			return
		else:
			if array[lchild] > array[rchild]:
				array[index] = array[lchild]
				index = lchild
			else:
				array[index] = array[rchild]
				index = rchild

		lchild = 2 * index
		rchild = lchild + 1


	if lchild == size_of_array and value_at_index < array[lchild]:
		array[index] = array[lchild]
		index = lchild
	array[index] = value_at_index


size_of_array = int((input("Enter number of elements in the array: ")));
array = [None] * (size_of_array+1)

for i in range(1,size_of_array+1):
	array[i] = int(input("Enter the elements: "))

heapSort(array, size_of_array)

for i in range(1, size_of_array+1):
	print(array[i]," " ,end=" ")
print()

