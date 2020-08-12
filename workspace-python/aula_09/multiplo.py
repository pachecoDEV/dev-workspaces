numero = int(input("Digite um número: "))
cinco = 5
dez = 10

resto_1 = numero % 5
resto_2 = numero % 10

if resto_1 != resto_2:
    print("O número não é múltiplo de 5 e 10 ao mesmo tempo.")
else:
    print("O número é múltiplo de 5 e 10 ao mesmo tempo.")