termos = int(input("Digite o número de termos da sequência de Fibonacci: "))

cont = termos
while cont == termos:
    soma = termos + (cont - 1)
    print(soma)
    break