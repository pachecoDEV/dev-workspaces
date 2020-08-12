opcao = "s"

while opcao == "s":
    tabuada = int(input("Digite a tabuada que deseja calcular: "))
    multiplicador = 0
    while multiplicador <= 10:
        if tabuada >= 0:
            print(tabuada, " X ", multiplicador, " = ", tabuada * multiplicador)
            multiplicador += 1
        else:
            print("Número digitado é inválido!")
            break
    opcao = str(input("Deseja fazer outra tabuada? [s] ou [n]"))