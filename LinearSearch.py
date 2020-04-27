
def LinearSearch(arr,searchValue):

	for i in range(len(arr)):
		if arr[i] >= searchValue:
			break
	
	if arr[i] == searchValue:
		return i
	else:
		return -1

n = int(input("Enter the number of elements in the array: "))

arr = [None] * n

for i in range(n):
	arr[i] = int(input("Enter the elementsin sorted order: "))

searchValue = int(input("Enter the elements to be searched: "))

index = LinearSearch(arr, searchValue)

if index == -1:
	print(searchValue," not present in the array")
else:
	print(searchValue," found at index ",index)