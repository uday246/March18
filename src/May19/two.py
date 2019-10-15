def isSame(puzzle):
    i=0
    while(i<10):
        j=0
        while(j<10):
            print(puzzle[j][i])
            if(puzzle[j][i]!=i):
                return False
            j=j+1
        i=i+1
    return True

T = [[0, 1, 2],[0, 1, 2],[0, 1, 2]]
print(isSame(T))
