import menuXPTO

def alterarproduto():
    codproduto = input("Código: ")
    index = codproduto.index(codproduto)
    print(menuXPTO.estoque)
    if codproduto in menuXPTO.codproduto:
        print("Descrição: ", menuXPTO.descproduto[index],
                "Quantidade: ", menuXPTO.qtdeproduto[index])
        menuXPTO.descproduto[index] = input("Nova descrição: ").upper()
        menuXPTO.qtdeproduto[index] = int(input("Nova quantidade: "))
        print("Descrição alterada para: ", menuXPTO.descproduto[index],
                "Quantidade alterada para: ", menuXPTO.qtdeproduto[index])
    else:
        print("Produto não cadastrado.")