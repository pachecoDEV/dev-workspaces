numero_1 = int(input("Digite um número inteiro: "))
numero_2 = int(input("Digite um número inteiro: "))

resultado = ((numero_1 % 2) * 3) + (13 - 2 + numero_2)

print(resultado)

if resultado <= 0:
    print("Resultado menor ou igual à 0.")
else:
    if resultado > 0 and resultado <= 20:
        print("Resultado maior que zero e menor igual à 20.")
    else:
        print("Resultado maior que 20.")
