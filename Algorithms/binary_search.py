array = [num for num in range(1,11)]
print(array)
def binary_search(num, array):
    first_num = 0 
    last_num = len(array) - 1

    while first_num <= last_num: 
        mid = (first_num+last_num)//2
        if array[mid] == num:
            return num 
        elif array[mid] < num:
            first_num = mid + 1
        else:
            last_num = mid - 1 
    return None
search = binary_search(4,array)
print(search)