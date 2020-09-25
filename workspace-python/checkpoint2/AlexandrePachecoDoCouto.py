opcao = 0
lojas = {}
prods = {}
produtos = []

while opcao != 5:
    print("Menu de opções:")
    print("1 - Cadastrar Lojas")
    print("2 - Cadastrar Produtos")
    print("3 - Listar Produtos por Loja")
    print("4 - Sair")

    numEscolha = int(input("Digite a opção desejada:"))

    if numEscolha == 1:
        if len(lojas.keys()) == 6:
            print("Não é possível acessar essa opção novamente.")
        else:
            while len(lojas.keys()) < 6:
                _codigo = int(input("Código da Loja: "))
                if _codigo in lojas.keys() or _codigo <= 0:
                    print("Código inválido, tente novamente.")
                else:
                    _nomeLoja = input("Nome da Loja: ").upper()
                    lojas[_codigo] = _nomeLoja

    elif numEscolha == 2:
        cont = 0
        while cont < 6:
            if len(lojas.keys()) < 6:
                print("Favor cadastrar as lojas primeiro.")
            else:
                print("Lojas cadastradas: ")
                print(lojas)
                selectLoja = int(input("Digite o código da loja: "))
                if selectLoja in lojas.keys():

                    codigoDoProduto = int(input("Digite o código do produto: "))
                    descDoProduto = input("Digite a descrição do produto: ")
                    prods[codigoDoProduto] = descDoProduto

                    novo = []
                    nomeProduto = input("Digite o nome do produto: ")
                    valorProduto = input("Digite o valor do produto: ")
                    if prods.keys() in produtos:
                        print("Codigo do produto ja existe, tente outro!")
                    else:
                        novo.append(selectLoja)
                        novo.append(prods.keys())
                        novo.append(prods.values())
                        novo.append(nomeProduto)
                        novo.append(valorProduto)
                        produtos.append(novo)
                else:
                    print("Loja não cadastrada.")

                cont += 1

    elif numEscolha == 3:
        print(lojas)
        print(produtos)
    elif numEscolha == 4:
        print("Saindo...")
        break
    else:
        print("Opção inválida, por favor escolha outra opção.")