parity_block = [
    [0,1,0,1,0,1,0,1],
    [1,0,1,1,0,1,0,0],
    [1,1,0,1,1,1,1,0],
    [0,1,0,1,1,0,1,0],
    [0,0,1,0,1,1,1,0],
    [0,1,1,1,1,0,1,1],
    [0,1,0,1,0,1,0,1],
    [1,0,0,1,1,0,1,0]
]

row_count = 0
col_count = 0
wrong_row = None
wrong_col = None

def parity_check(arr):
    global wrong_col,wrong_row
    for i in range(0,len(arr)):
        for j in range(0,len(arr[i])):
            global row_count 
            global col_count 
            row_count += arr[i][j]
            col_count += arr[j][i]
        #print("Row ",i," : ",row_count)
        #print("column ",i," : ",col_count)
        if col_count %2 != 0:
            #print("Column, ",i," is correct!")
            col_count = 0 
        else:
            #print("Column, ",i," is wrong!")
            wrong_col = i 
            col_count = 0 

        if row_count %2 == 0:
            #print("Row, ",i," is correct!")
            row_count = 0
        else:
            print("Row, ",i," is wrong")
            row_count = 0
            wrong_row = i
    print("Wrong digit at location: ") 
    print("Row: ",wrong_row) 
    print("Column: ",wrong_col) 

if __name__ == "__main__":
    parity_check(parity_block)
