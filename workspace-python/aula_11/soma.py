n1 = int(input("Digite um número: "))
n2 = int(input("Digite outro número: "))

soma = 0
if n1 < n2:
    n1 = n1 + 1
    while n1 < n2:
        soma = soma + n1
        n1 = n1 + 1
if n1 > n2:
    n2 = n2 + 1
    while n1 > n2:
        soma = soma + n2
        n2 = n2 + 1
print("A soma dos elementos entre os números informado é:", soma)