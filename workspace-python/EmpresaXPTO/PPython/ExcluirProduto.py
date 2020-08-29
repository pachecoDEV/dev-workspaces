import menuXPTO

def excluir_produto():
    codigo = input("Código: ")
    if codigo in menuXPTO.codproduto:
        print("Descrição: ", menuXPTO.estoque[1], "Quantidade: ", menuXPTO.estoque[2])
        opcao = input("Deseja excluir o produto? [S/N] ").upper()
        if opcao == "s".upper():	
            menuXPTO.estoque(menuXPTO.estoque[0])
            print("\033[32mProduto excluido com sucesso\033[m")
        elif opcao == "n".upper():
            print("\033[31mProduto não excluido\033[m")
        else:
            print("\033[31mOpção inválida\033[m")
    else:
        print("\033[31mProduto não cadastrado\033[m")