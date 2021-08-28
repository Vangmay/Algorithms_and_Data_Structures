def binary_search():
    print("Think of a number between 0 to 10000")
    first = 0 
    last = 10000
    while first <= last:
        mid = (first+last)//2
        confirm = input("Is your number: {num} \n".format(num = mid))
        if confirm == "Y":
            print("YASS")
            return("Yass")
        if confirm == "G":
            first = mid + 1
        elif confirm=="L":
            last = mid - 1 
if __name__ == "__main__":
    binary_search()