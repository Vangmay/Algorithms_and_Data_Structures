import time 

array = [i for i in range(0,1000)]

def linear_search(number,array):
    for i in range(0,len(array)):
        if array[i] == number:
            print("Number is present")
            return True
    else:
        print('Not present ¯\_(ツ)_/¯ ')
linear_search(9999,array)