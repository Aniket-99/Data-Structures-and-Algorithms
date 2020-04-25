def QuickSort(arr):
	Sort(arr, 0, len(arr) - 1)


def Sort(arr, low, high):
	if low >= high:
		return

	p = partition(arr, low, high)
	Sort(arr, low, p-1)
	Sort(arr, p+1, high)


def partition(arr, low, high):
	pivot = arr[low]
	i = low + 1
	j = high

	while i <=  j:
		while arr[i] < pivot and i < high:
			i+=1
		while arr[j] > pivot:
			j-=1

		if i < j:
			temp = arr[i]
			arr[i] = arr[j]
			arr[j] = temp
			i+=1
			j-=1

		else:
			break

	arr[low] = arr[j]
	arr[j] = pivot

	return j


total = int(input("Enter the number of elements in the list: "))
arr = []

for i in range(total):
	value = int(input("Enter the value: "))
	arr.append(value)

QuickSort(arr)

print("The sorted array is: ", arr)
