import menuXPTO

def cadastrarprodutos():
    codproduto = input("Código: ")
    if codproduto in menuXPTO.codproduto:
        print("Código já cadastrado")
    else:
        descproduto = input("Descrição do produto: ").upper()
        qtdeproduto = int(input("Quantidade: "))
        menuXPTO.estoque.append(codproduto)
        menuXPTO.estoque.append(descproduto)
        menuXPTO.estoque.append(qtdeproduto)