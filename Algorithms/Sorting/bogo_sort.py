from random import randint

arr = [4,35,34,454,213,34278148134,41874813]

print(sorted(arr))

def hooga_booka(arr):
    #take random integer
    take = randint(0,len(arr)-1)
    #Store the index number value from that number
    replace = arr[take]
    #Take another random number
    place = randint(0,len(arr)-1)
    #Take the value from that index and store it in place of the previous number
    sub = arr[place]
    arr[place] = take
    arr[take] = sub
    if sorted(arr) == arr:
        return arr
    else:
        hooga_booka(arr)

if __name__ == "__main__":
    hooga_booka(arr)
    