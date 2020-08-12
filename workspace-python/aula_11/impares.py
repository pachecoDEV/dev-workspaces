numero_inicial = int(input("Digite um número: "))
numero_final = int(input("Digite outro número: "))
contador = 0
numero_inicial = numero_inicial + 1
while numero_inicial < numero_final:
    resultado = numero_inicial % 2
    if resultado != 0:
        contador = contador + 1
        print("O número", numero_inicial, "é ímpar!")
    numero_inicial = numero_inicial + 1
print("A quantidade de números ímpares é: ", contador)