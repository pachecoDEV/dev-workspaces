import menuXPTO

def comprar_produto():
    codigo = int(input("Código do produto: "))
    for menuXPTO.alterar in menuXPTO.estoque:
        if menuXPTO.estoque[0] == codigo:
            print("\nCódigo:", f"{menuXPTO.estoque[0]}", "Descrição:", f"{menuXPTO.estoque[1]}", "Quantidade:", f"{menuXPTO.estoque[2]}\n")
            quant_prod = int(input("Quanto deseja comprar: "))  # ==> Comprando somente o primeiro item da lista
            while quant_prod <= 0:
                print("\033[31mImpossível comprar uma quantia menor ou igual a zero\033[m")
                quant_prod = int(input("Quanto deseja comprar: "))
            menuXPTO.estoque[2] = quant_prod + menuXPTO.estoque[2]
            print("\nCódigo:", f"{menuXPTO.estoque[0]}", "Descrição:", f"{menuXPTO.estoque[1]}", "Quantidade:", f"{menuXPTO.estoque[2]}\n")
            break
        else:
            print("\033[31mProduto não cadastrado\033[m")
            break