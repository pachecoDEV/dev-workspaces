import menuXPTO

def vender_produto():
    menuXPTO.codigo = input("Código do produto: ")
    for menuXPTO.alterar in menuXPTO.codproduto:
        if menuXPTO.estoque[0] == menuXPTO.codigo:
            print("\nCódigo:", f"{menuXPTO.estoque[0]}", "Descrição:", f"{menuXPTO.estoque[1]}", "Quantidade:", f"{menuXPTO.estoque[2]}\n")
            quant_prod = int(input("Quanto deseja vender: "))
            while quant_prod <= 0:
                print(
                    "\033[31mImpossível vender uma quantia menor ou igual a zero\033[m")  # ==> Vendendo somente o primeiro item da lista
                quant_prod = int(input("Quanto deseja vender: "))

            menuXPTO.estoque[2] = menuXPTO.estoque[2] - quant_prod
            print("\nCódigo:", f"{menuXPTO.estoque[0]}", "Descrição:", f"{menuXPTO.estoque[1]}", "Quantidade:", f"{menuXPTO.estoque[2]}\n")
            break
        else:
            print("\033[31mProduto não cadastrado\033[m")
            break