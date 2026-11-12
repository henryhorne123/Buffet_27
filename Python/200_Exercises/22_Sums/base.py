num1 = input("Please choose a number: ")
num1 = int(num1)
x = 0
x = int(x)
print("You chose "+str(num1))
for a in range (1,num1):
    print(a, end="")
    print("+", end="")
    x = x+a
print(num1, end="")
print("="+str(num1+x))
