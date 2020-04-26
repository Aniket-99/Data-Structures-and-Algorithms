def heapSort(arr, n):
	build_heap_bottom_up(arr, n)

	while n > 1:
		maxValue = arr[1]
		arr[1] = arr[n]
		arr[n] = maxValue
		n = n-1
		restoreDown(1, arr, n)  


def build_heap_bottom_up(arr, n):
	i = n//2
	while i>=1:
		restoreDown(i, arr, n)
		i = i-1

def restoreDown(i, arr, n):
	k = arr[i]
	lChild = 2 * i
	rChild = lChild + 1

	while rChild <= n:
		if k >= arr[rChild] and k >= arr[lChild]:
			arr[i] = k
			return
		elif arr[lChild] > arr[rChild]:
			arr[i] = arr[lChild]
			i = lChild
		else:
			arr[i] = arr[rChild]
			i = rChild

		lChild = 2 * i
		rChild = lChild + 1


	if lChild == n and k < arr[lChild]:
		arr[i] = arr[lChild]
		i = lChild
	arr[i] = k


n = int(input("Enter the number of elements: "))

arr = [None] * (n+1)

for i in range(1,n+1):
	arr[i] = int(input("Enter the number: "))

heapSort(arr, n)

for i in range(1,n+1):
	print(arr[i], " ", end="")
print()