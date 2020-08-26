import menuXPTO

def alterarproduto():
    codigoproduto = int(input("Código: "))
    if codigoproduto in menuXPTO.codproduto:
        print("Descrição: ", menuXPTO.descproduto, "Quantidade: ", menuXPTO.qtdeproduto)
        menuXPTO.descproduto[menuXPTO.codproduto.index(codigoproduto)] = input("Nova descrição: ").upper()
        menuXPTO.qtdeproduto[menuXPTO.codproduto.index(codigoproduto)] = int(input("Nova quantidade: "))
        print("Descrição alterada para: ", menuXPTO.descproduto, "Quantidade alterada para: ", menuXPTO.qtdeproduto)
    else:
        print("Produto não cadastrado.")