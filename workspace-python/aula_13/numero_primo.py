numero = int(input("Digite um número: "))

while numero:
    if numero % 2 == 0:
        print("O número digitado não é primo.")
    else:
        print("O número digitado é primo.")
    break