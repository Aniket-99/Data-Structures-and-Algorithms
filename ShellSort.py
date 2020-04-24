def ShellSort(arr):
	
	h = int(input("Enter the increement value (odd): "))

	while h >= 1:
		for i in range(h, len(arr)):
			temp = arr[i]
			j = i - h
			while j >= 0 and arr[j] > temp:
				arr[j+h] = arr[j]
				j = j - h
			arr[j+h] = temp
		h = h - 2

totalElements = int(input("Enter the number of value in the list: "))
arr = []

for i in range(0,totalElements):
	value = int(input("Enter the value: "))
	arr.append(value)

ShellSort(arr)
print("The sorted list using shell sort is: ",arr)


