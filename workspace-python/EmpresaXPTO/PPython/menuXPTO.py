opcao = 0

codproduto = []
descproduto = []
qtdeproduto = []
estoque = []

while opcao != 7:
    print('\nMenu')
    opcao = int(input(
        "\t1. Cadastrar Produto\n\t"
        "2. Alterar Produto\n\t"
        "3. Excluir Produto\n\t"
        "4. Listar Estoque de Peça\n\t"
        "5. Comprar Produto\n\t"
        "6. Vender Produto\n\t"
        "7. Sair\n\t"
        "Digite a opção desejada: "))

    if opcao == 1:
        def cadastrarprodutos():
            codproduto = int(input("Código: "))
            if codproduto in estoque:
                print("Código já cadastrado")
            else:
                descproduto = input("Descrição do produto: ").upper()
                qtdeproduto = int(input("Quantidade: "))
                estoque.append(codproduto)
                estoque.append(descproduto)
                estoque.append(qtdeproduto)

        cadastrarprodutos()

    elif opcao == 2:
        cont = 3
        senha = input("Digite sua senha: ")
        while senha != "yN1825*a" and cont > 1:
            print("Senha incorreta, você têm mais ", cont - 1, " tentativas.")
            senha = input("Digite novamente.\nSenha: ")
            cont = cont - 1
        if senha == "yN1825*a":
            print("Acesso permitido.")

            def alterarproduto():
                codproduto = input("Código: ")
                index = codproduto.index(codproduto)
                if codproduto in estoque:
                    print("Descrição: ", descproduto[index],
                          "Quantidade: ", qtdeproduto[index])
                    descproduto[index] = input("Nova descrição: ").upper()
                    qtdeproduto[index] = int(input("Nova quantidade: "))
                    print("Descrição alterada para: ", descproduto[index],
                          "Quantidade alterada para: ", qtdeproduto[index])
                else:
                    print("Produto não cadastrado.")

            alterarproduto()

        else:
            print("SENHA BLOQUEADA!")

    elif opcao == 3:
        cont = 3
        senha = input("Digite sua senha: ")
        while senha != "yN1825*a" and cont > 1:
            print("Senha incorreta, você têm mais ", cont - 1, " tentativas.")
            senha = input("Digite novamente.\nSenha: ")
            cont = cont - 1
        if senha == "yN1825*a":
            print("Acesso permitido.")

            def removerproduto():
                codproduto = int(input("Código: "))
                if codproduto in estoque:
                    print("Descrição: ", descproduto, "Quantidade: ", qtdeproduto)
                    opcao = input("Deseja excluir o produto? [S] ou [N]").upper()
                    if opcao == "s".upper():
                        codproduto.pop(codproduto.index(codproduto))
                        descproduto.pop(codproduto.index(codproduto))
                        qtdeproduto.pop(codproduto.index(codproduto))
                        print("PRODUTO EXCLUIDO COM SUCESSO")
                    elif opcao == "n".upper():
                        print("PRODUTO NÃO EXCLUÍDO")
                    else:
                        print("OPÇÃO INVÁLIDA")
                else:
                    print("PRODUTO NÃO CADASTRADO")

            removerproduto()

        else:
            print("Senha Bloqueada!")
            
    elif opcao == 4:
        def listarprodutos():
            print("CÓDIGO\tDESCRIÇÃO\tQUANTIDADE EM ESTOQUE:")
            print(6 * '-', '', 9 * '-', ' ', 22 * '-')
            print(estoque)

        listarprodutos()

    elif opcao == 5:
        print("Comprar produto")

    elif opcao == 6:
        print("Vender produto")

    elif opcao == 7:
        print("Saindo...")
        break

    else:
        print("Opção inválida!")
