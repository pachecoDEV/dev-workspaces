maior = 0
menor = 0
qtde = 0
cont = 0

while cont < 5:
    numero = int(input("Digite um número inteiro: "))
    qtde += 1
    if qtde == 1:
        maior = menor = numero
    else:
        if numero > maior:
            maior = numero
        if numero < menor:
            menor = numero
    cont += 1

print(maior)
print(menor)