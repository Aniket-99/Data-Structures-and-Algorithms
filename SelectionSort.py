def SelectionSort(nums):
	
	for i in range(len(nums) - 1):
		minIndex = i

		for j in range(i , len(nums)):
			if nums[j] < nums[minIndex]:
				minIndex = j

		# temp = nums[i]
		# nums[i] = nums[minIndex]
		# nums[minIndex] = temp

		nums[i],nums[minIndex] = nums[minIndex],nums[i]
 
		print(nums)

nums = []

x = int(input("Enter the number of element in the array: "))

for i in range(x):
	value = int(input("Enter the number: "))
	nums.append(value)

SelectionSort(nums)
print("Sorted list is", nums)

