numero_1 = int(input("Digite a base do triângulo: "))
numero_2 = int(input("Digite um dos lados do triângulo: "))
numero_3 = int(input("Digite o outro lado do triângulo: "))

if numero_1 == numero_2 and numero_1 == numero_3:
    print("O triângulo é equilátero.")
elif numero_1 != numero_2 and numero_1 != numero_3:
    if numero_2 == numero_3:
        print("O triângulo é escaleno.")
    else:
        print("O triângulo é isósceles.")