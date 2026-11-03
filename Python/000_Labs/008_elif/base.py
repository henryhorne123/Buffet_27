num1 = input("Pick a number: ")
num2 = input("Pick another number: ")
op = input("Pick an operation(Write the symbol, for multiplication write *, division: /, etc): ")
print("Calculating your equation")
if op == "-":
    print(num1 + "-" + num2 +"=" + str(int(num1)-int(num2)))
elif op == "+":
    print(num1 + "+" + num2 +"=" + str(int(num1)+int(num2)))
elif op == "/":
    print(num1 + "/" + num2 +"=" + str(int(num1)/int(num2)))
elif op == "*":
    print(num1 + "*" + num2 +"=" + str(int(num1)*int(num2)))
else:
    print("Sorry that was not an operation I can take in")
