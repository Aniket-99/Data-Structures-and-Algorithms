def InsertionSort(arr):

	for i in range(1,len(arr)):

		key = arr[i]
		j = i - 1

		while j >= 0 and key < arr[j]:
			arr[j + 1] = arr[j]
			j-=1
		arr[j + 1] = key


list = []
total = int(input("Enter number of elements to be added: "))
for i in range(0,total):
	numbers = int(input("Enter the numbers: "))
	list.append(numbers)
InsertionSort(list)

for i in range(len(list)):
	print(" %d " %list[i])
