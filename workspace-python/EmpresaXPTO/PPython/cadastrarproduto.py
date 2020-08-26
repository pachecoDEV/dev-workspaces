import menuXPTO

def cadastrarprodutos():
    codigoproduto = int(input("Código: "))
    if codigoproduto in menuXPTO.codproduto:
        print("Código já cadastrado")
    else:
        menuXPTO.produtos.append([menuXPTO.codproduto, menuXPTO.descproduto, menuXPTO.qtdeproduto])
        menuXPTO.codproduto.append(codigoproduto)
        menuXPTO.descproduto[menuXPTO.codproduto.index(codigoproduto)] = input("Descrição: ").upper()
        menuXPTO.qtdeproduto[menuXPTO.codproduto.index(codigoproduto)] = int(input("Quantidade: "))