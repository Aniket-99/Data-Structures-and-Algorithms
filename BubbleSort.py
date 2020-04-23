def BubbleSort(arr):

	for i in range(len(arr) - 1,0,-1):
		swaps = 0
		for j in range(i):
			if arr[j] > arr[j+1]:
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
				swaps+=1
				print(arr)
				print("The swap is",swaps)

		if swaps == 0: # If the swaps is 0, then it means that the array is sorted
			break





arr = []
x = int(input("Enter the mumber of elements in the array: "))

for i in range(x):
	value = int(input("Enter the value: "))
	arr.append(value)

BubbleSort(arr)
print("The Sorted array is: ", arr)