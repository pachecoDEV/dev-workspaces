opcao = 0

codproduto = []
descproduto = []
qtdeproduto = []
produtos = []

while opcao != 7:
    print('\nMenu')
    opcao = int(input(
        "\t1. Cadastrar Produto\n\t2. Alterar Produto\n\t3. Excluir Produto\n\t4. Listar Estoque de Peça\n\t5. Comprar Produto\n\t6. Vender Produto\n\t7. Sair\n\tDigite a opção desejada: "))
    if opcao == 1:
        def cadastrarprodutos():
            codigoproduto = int(input("Código: "))
            if codigoproduto in codproduto:
                print("Código já cadastrado")
            else:
                produtos.append([codproduto, descproduto, qtdeproduto])
                codproduto.append(codigoproduto)
                descricaoproduto = input("Descrição: ")
                descricaoproduto = descricaoproduto.upper()
                descproduto.append(descricaoproduto)
                quantidadeproduto = int(input("Quantidade: "))
                qtdeproduto.append(quantidadeproduto)


        cadastrarprodutos()

    elif opcao == 2:
        senha = input("Digite sua Senha: ")
        if (senha == "yN1825*a"):
            print("Acesso permitido.")


            def alterarproduto():
                codigoproduto = int(input("Código: "))
                if codigoproduto in codproduto:
                    print("Descrição: ", descproduto, "Quantidade: ", qtdeproduto)
                    descricaoproduto = input("Nova descrição: ")
                    descricaoproduto = descricaoproduto.upper()
                    descproduto.remove(descproduto[0])
                    descproduto.append(descricaoproduto)
                    quantidadeproduto = int(input("Nova quantidade: "))
                    qtdeproduto.remove(qtdeproduto[0])
                    qtdeproduto.append(quantidadeproduto)
                    print("Descrição alterada para: ", descproduto, "Quantidade alterada para: ", qtdeproduto)
                else:
                    print("Produto não cadastrado.")


            alterarproduto()
        else:
            print("SENHA INCORRETA")

    elif opcao == 3:
        senha = input("Digite sua Senha: ")
        if senha == "yN1825*a":
            print("Acesso permitido.")


            def removerproduto():
                codigoproduto = int(input("Código: "))
                if codigoproduto in codproduto:
                    print("Descrição: ", descproduto, "Quantidade: ", qtdeproduto)
                    opcao = input("Deseja excluir o produto? [S] ou [N]").upper()
                    if opcao == "s".upper():
                        codproduto.remove(codproduto[0])
                        descproduto.remove(descproduto[0])
                        qtdeproduto.remove(qtdeproduto[0])
                        print("PRODUTO EXCLUIDO COM SUCESSO")
                    elif opcao == "n".upper():
                        print("PRODUTO NÃO EXCLUÍDO")
                    else:
                        print("Opção inválida.")
                else:
                    print("PRODUTO NÃO CADASTRADO")


            removerproduto()
        else:
            print("SENHA INCORRETA")
            
    elif opcao == 4:
        print(sorted(codproduto), descproduto, qtdeproduto)

    elif opcao == 5:
        print("Comprar produto")

    elif opcao == 6:
        print("Vender produto")

    elif opcao == 7:
        print("Saindo...")
        break

    else:
        print("Opção inválida!")
