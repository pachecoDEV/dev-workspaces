import math
menu = 0

while menu != 4:
    print("Escolha a opção desejada: [1] Somar - [2] Raiz Quadrada - [3] Sair")
    menu = int(input("Qual a opção desejada: "))

    if menu == 1:
        numero1 = int(input("Digite um número inteiro: "))
        numero2 = int(input("Digite outro número inteiro: "))
        resultado1 = numero1 + numero2
        print("O resultado da soma dos dois números é: ", resultado1)

    elif menu == 2:
        numero3 = int(input("Digite um número inteiro: "))
        resultado2 = math.sqrt(numero3)
        print("A raiz quadrada do número informado é: ", resultado2)

    elif menu == 3:
        print("Saindo...")
        break

    elif menu != 1 or menu != 2 or menu != 3:
        print("Opção inválida. Digite novamente.")