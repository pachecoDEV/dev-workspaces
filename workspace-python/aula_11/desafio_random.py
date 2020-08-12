from random import randint

aleatorio = randint(100, 110)
n1 = int(input("Digite um número entre 100 e 110: "))

if n1 < 100 or n1 > 110:
    print("O número digitado é inválido.")
else:
    soma = 0
    print("O número aleatório é: ", aleatorio)
    print("O número digitado é: ", n1)

    while aleatorio != n1:
        soma = soma + aleatorio
        aleatorio = randint(100, 110)
        soma = soma + aleatorio
        print("A soma dos valores é: ", soma)

    if n1 == aleatorio:
        print("O número gerado aleatoriamente e o digitado são iguais.")

