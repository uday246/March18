def get_temps():
    myList=[]
    print("Enter last 5 days temparatures")
    for i in range(0,5):
        myList.append(float(input("Enter temparature")))
    return myList

def find_high_temps(myList):
        result=[]
        for x in myList:
            if(x>=90):
                result.append(x)
        return result
def display_results(myList):
    print("Hot days")
    for x in myList:
        print(x)

        
if __name__ == '__main__':
    
    myList=get_temps()
    myList=find_high_temps(myList)
    display_results(myList)