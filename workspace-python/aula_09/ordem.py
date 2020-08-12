numero_1 = int(input("Digite um número: "))
numero_2 = int(input("Digite um número: "))
numero_3 = int(input("Digite um número: "))

if numero_1 < numero_2 and numero_1 < numero_3:
    if numero_2 < numero_3:
        print("Os números FORAM digitados em ordem crescente.")
else:
    print("Os números NÃO foram digitados em ordem crescente.")

if numero_1 == numero_2 and numero_1 == numero_3:
    print("Os três número digitados são iguais.")