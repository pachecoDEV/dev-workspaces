import menuXPTO

def cadastrarprodutos():
    codproduto = int(input("Código: "))
    if codproduto in menuXPTO.estoque:
        print("Código já cadastrado")
    else:
        descproduto = input("Descrição do produto: ").upper()
        qtdeproduto = int(input("Quantidade: "))
        menuXPTO.estoque.append(codproduto)
        menuXPTO.estoque.append(descproduto)
        menuXPTO.estoque.append(qtdeproduto)