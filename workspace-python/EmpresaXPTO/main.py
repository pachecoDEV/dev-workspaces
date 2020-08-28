menu = 0

codigo = []
descricao = []
quantidade = []
estoque = []

while menu != 7:
    print("\nMenu")
    opcao = int(input("\t1 - Cadastrar Produto\n\t2 - Alterar Produto\n\t3 - Excluir Produto"
                      "\n\t4 - Listar Estoque de Peça\n\t5 - Comprar Produto"
                      "\n\t6 - Vender Produto\n\t7 - Sair\n\nDigite a opção desejada: "))
    if opcao == 1: #Cadastrar Produto
        codigo = int(input("Código do produto: "))
        if codigo in estoque:
            print("\033[31mCódigo já cadastrado\033[m")
        else:
            descricao = input("Descrição do produto: ").upper()
            quantidade = int(input("Quantidade de estoque: "))
            estoque.append(codigo)
            estoque.append(descricao)
            while quantidade <= 0:
                print("\033[31mNão é permitido ter estoque menor ou igual a zero\033[m")
                quantidade = int(input("Quantidade de estoque: "))

            estoque.append(quantidade)

            print(estoque)

    elif opcao == 2: #Alterar Produto
        cont = 3
        senha = input("Digite sua senha: ")
        while senha != "yN1825*a" and cont > 1:
            print("\033[31mSenha incorreta, você têm mais ", cont - 1, " tentativas.\033[m")
            senha = input("Digite novamente.\nSenha: ")
            cont = cont - 1
        if senha == "yN1825*a":
            print("\033[32mAcesso permitido!\033[m")
            codigo = int(input("Código: "))
            if codigo in estoque:                                                                                       #Alterando apenas o primeiro elemento da lista
                for produto in estoque:
                    if estoque[0] == codigo:
                        print("Descrição: ", f"{estoque[1]}", "\nQuantidade: ", f"{estoque[2]}")
                        novo_desc = input("Digite a nova descrição: ").upper()
                        novo_quant = int(input("Digite a nova quantia: "))
                        estoque[1] = novo_desc
                        while novo_quant <= 0:
                            print("\033[31mNão é permitido ter estoque menor ou igual a zero\033[m")
                            novo_quant = int(input("Digite a nova quantia: "))
                        estoque[2] = novo_quant
                        print("\n\033[32mAlteração finalizada!\033[m")
                        break
            else:
                print("\033[31mProduto não cadastrado.\033[m")
        else:
            print("\033[31mSeu acesso foi bloqueado! Procure o administrador.\033[m")
            exit()

    elif opcao == 3: #Excluir Produto
        cont = 3
        senha = input("Digite sua senha: ")
        while senha != "yN1825*a" and cont > 1:
            print("\033[31mSenha incorreta, você têm mais ", cont - 1, " tentativas.\033[m")
            senha = input("Digite novamente.\nSenha: ")
            cont = cont - 1
        if senha == "yN1825*a":
            print("\033[32mAcesso permitido!\033[m")
            codigo = int(input("Código: "))
            if codigo in estoque:
                print("Descrição: ", estoque[1], "Quantidade: ", estoque[2])
                opcao = input("Deseja excluir o produto? [S/N] ").upper()
                if opcao == "s".upper():
                    # estoque.pop(estoque.index(codigo))
                    # estoque.pop(estoque.index(descricao))                                                             #==> ValueError: [] is not in list
                    # estoque.pop(estoque.index(quantidade))
                    print("\033[32mProduto excluido com sucesso\033[m")
                elif opcao == "n".upper():
                    print("\033[31mProduto não excluido\033[m")
                else:
                    print("\033[31mOpção inválida\033[m")
            else:
                print("\033[31mProduto não cadastrado\033[m")
        else:
            print("\033[31mSeu acesso foi bloqueado! Procure o administrador.\033[m")
            exit()

    elif opcao == 4: #Listar Estoque
        print(estoque)

    elif opcao == 5: #Comprar Produto
        codigo = int(input("Código do produto: "))
        for alterar in estoque:
            if estoque[0] == codigo:
                print("\nCódigo:", f"{estoque[0]}","Descrição:", f"{estoque[1]}", "Quantidade:", f"{estoque[2]}\n")
                quant_prod = int(input("Quanto deseja comprar: "))                                                      #==> Comprando somente o primeiro item da lista
                while quant_prod <= 0:
                    print("\033[31mImpossível comprar uma quantia menor ou igual a zero\033[m")
                    quant_prod = int(input("Quanto deseja comprar: "))

                estoque[2] = quant_prod + estoque[2]
                print("\nCódigo:", f"{estoque[0]}", "Descrição:", f"{estoque[1]}", "Quantidade:", f"{estoque[2]}\n")
                break
            else:
                print("\033[31mProduto não cadastrado\033[m")
                break
    elif opcao == 6: #Vender Produto
        codigo = int(input("Código do produto: "))
        for alterar in estoque:
            if estoque[0] == codigo:
                print("\nCódigo:", f"{estoque[0]}", "Descrição:", f"{estoque[1]}", "Quantidade:", f"{estoque[2]}\n")
                quant_prod = int(input("Quanto deseja vender: "))
                while quant_prod <= 0:
                    print("\033[31mImpossível vender uma quantia menor ou igual a zero\033[m")                          #==> Vendendo somente o primeiro item da lista
                    quant_prod = int(input("Quanto deseja vender: "))

                estoque[2] = quant_prod - estoque[2]
                print("\nCódigo:", f"{estoque[0]}", "Descrição:", f"{estoque[1]}", "Quantidade:", f"{estoque[2]}\n")
                break
            else:
                print("\033[31mProduto não cadastrado\033[m")
                break

    elif opcao == 7: #Sair
        print("\nSaindo...")
        break

    else:
        print("\n\033[31mOpção Inválida! Tente Novamente\033[m")