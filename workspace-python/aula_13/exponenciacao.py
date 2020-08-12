continua = "S"

while continua == "S":
    base = int(input("Digite o número da base: "))
    expoente = int(input("Digite o expoente: "))
    resultado = base ** expoente
    print("O resultado da exponenciação de", base, "por", expoente, "é:", resultado )
    continua = str(input("Deseja continuar? [S] ou [N]"))
    continua = continua.upper()
