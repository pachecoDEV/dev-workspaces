import menuXPTO

def removerproduto():
    codigoproduto = int(input("Código: "))
    if codigoproduto in menuXPTO.codproduto:
        print("Descrição: ", menuXPTO.descproduto, "Quantidade: ", menuXPTO.qtdeproduto)
        opcao = input("Deseja excluir o produto? [S] ou [N]").upper()
        if opcao == "s".upper():
            menuXPTO.codproduto.pop(menuXPTO.codproduto.index(codigoproduto))
            menuXPTO.descproduto.pop(menuXPTO.codproduto.index(codigoproduto))
            menuXPTO.qtdeproduto.pop(menuXPTO.codproduto.index(codigoproduto))
            print("PRODUTO EXCLUIDO COM SUCESSO")
        elif opcao == "n".upper():
            print("PRODUTO NÃO EXCLUÍDO")
        else:
            print("OPÇÃO INVÁLIDA")
    else:
        print("PRODUTO NÃO CADASTRADO")