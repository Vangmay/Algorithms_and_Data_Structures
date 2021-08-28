#make a pivot 
arr = [3,5,7,3,34,4,3,324,5,43]

#Pick pivot
#Partition the array
#recursion
def quick_sort(arr):
    if len(arr) <= 1:
        return arr 
    pivot = arr.pop() 
    
    greater,lesser = [],[] 

    for item in arr: 
        if item > pivot:
            greater.append(item)
        elif item <= pivot:
            lesser.append(item)
    
    #print(quick_sort(lesser) + quick_sort(greater))
    return quick_sort(greater) + [pivot] +  quick_sort(lesser)
    
if __name__ == "__main__":
    sorted = quick_sort(arr)
    print(sorted)