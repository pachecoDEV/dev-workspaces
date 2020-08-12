categoria = 0

while categoria != 4:
    produto = float(input("Digite o preço do produto: "))
    print("[1] Limpeza - [2] Alimentação - [3] Vestuário - [4] Sair")
    categoria = int(input("Qual a opção desejada: "))
    if categoria == 1 and produto <= 25:
        produto = (produto * 0.5) + produto
        print("O preço do produto com 5% de aumento é: ", produto)
    elif categoria == 2 and produto <= 25:
        print("[R] Necessita refrigeração - [N] Não necessita refrigeração")
        situacao = str(input("Digite a opção desejada: "))
        if situacao.upper() == "R":
            produto = (produto * 0.8) + produto
            produto = (produto * 0.5) + produto
            print("O produto com 8% de aumento e mais 5% de imposto é: ", produto)
            print("O produto necessita de refrigeração.")
        elif situacao.upper() == "N":
            produto = (produto * 0.8) + produto
            produto = (produto * 0.8) + produto
            print("O valor do produto com 8% de aumento mais 8% de imposto é: ", produto)
            print("O produto NÃO necessita de refrigeração.")
        else:
            print("Opção inválida!")
    elif categoria == 3 and produto <= 25:
        produto = (produto * 0.10) + produto
        print("O preço do produto com 10% de aumento é: ", produto)
    elif categoria == 1 and produto > 25:
        produto = (produto * 0.12) + produto
        print("O produto com 12% de aumento é: ", produto)
    elif categoria == 2 and produto > 25:
        print("[R] Necessita refrigeração - [N] Não necessita refrigeração")
        situacao = str(input("Digite a opção desejada: "))
        if situacao.upper() == "R":
            produto = (produto * 0.15) + produto
            produto = (produto * 0.5) + produto
            print("O produto com 15% de aumento e mais 5% de imposto é: ", produto)
            print("O produto necessita de refrigeração.")
        elif situacao.upper() == "N":
            produto = (produto * 0.15) + produto
            produto = (produto * 0.8) + produto
            print("O valor do produto com 15% de aumento mais 8% de imposto é: ", produto)
            print("O produto NÃO necessita de refrigeração.")
        else:
            print("Opção inválida!")
    elif categoria == 3 and produto > 25:
        produto = (produto * 0.18) + produto
        print("O produto com 18% de aumento é: ", produto)
    if produto <= 50:
        print("BARATO")
    elif produto > 50 and produto <= 120:
        print("NORMAL")
    else:
        print("CARO")