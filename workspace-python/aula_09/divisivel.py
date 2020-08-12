num1 = int(input("Digite um número: "))
num2 = int(input("Digite um número: "))
resto = num1 % num2

if resto == 0:
    print("O número", num1, "é divisível por", num2, ".")
else:
    print("O número", num1, "não é divisível por", num2, ".")