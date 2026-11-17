import random
list = [1,2,3,4,5,6,7,8,9,10]
num = input("How many numbers would you like?")
num = int(num)
for a in range(0,num):
    print(random.randrange(0,10), end=",")
