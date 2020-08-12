opcao = 0

while opcao != 3:
    print("[1] Somar dois números ou [2] Raiz Quadrada")
    opcao = int(input("Qual é a opção desejada: "))
    if opcao == 1:
        numero_1 = float(input("Primeiro número: "))
        numero_2 = float(input("Segundo número: "))
        resultado = numero_1 + numero_2
        print("O resultado é:", resultado)
    elif opcao == 2:
        numero_1 = int(input("Digite um número: "))
        print("A raiz quadrada do número é:", numero_1 ** 2)
    else:
        print("Opção inválida.")