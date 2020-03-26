def MergeSort(arr):

	if len(arr) > 1:
		mid = len(arr) // 2
		left = arr[:mid]
		right = arr[mid:]

		MergeSort(left)
		MergeSort(right)

		i = j = k = 0

		while i < len(left) and j < len(right):
			if left[i] < right[j]:
				arr[k] = left[i]
				i+=	1
			else:
				arr[k] = right[j]
				j+=1
			k+=1

		while i < len(left):
			arr[k] = left[i]
			i+=1
			k+=1

		while j < len(right):
			arr[k] = right[j]
			j+=1
			k+=1


def printList(arr):
	for i in range(len(arr)):
		print(arr[i], end=" ")
	print()

list = []
total = int(input("Enter number of elements to be added: "))
for i in range(0,total):
	numbers = int(input("Enter the numbers: "))
	list.append(numbers)
print("Before Sorting: ")
printList(list)
MergeSort(list)
print("Sorted array is: ")
printList(list)