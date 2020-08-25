opcao = 0

while opcao != 7:
    print('\nMenu')
    opcao = int(input("\t1. Cadastrar Produto\n\t2. Alterar Produto\n\t3. Excluir Produto\n\t4. Listar Estoque de Peça\n\t5. Comprar Produto\n\t6. Vender Produto\n\t7. Sair\n\tDigite a opção desejada: "))
    if opcao == 1:
        print("Opção 1 selecionada!")
    elif opcao == 2:
        senha = input("Digite sua senha: ")
        if senha == "yN1825*a":
            print("Acesso permitido.")
            print("Código do produto:")
        else:
            print("SENHA INCORRETA")
    elif opcao == 3:
        senha = input("Digite sua senha: ")
        if senha == "yN1825*a":
            print("Acesso permitido.")
            print("Código do produto:")
        else:
            print("SENHA INCORRETA")
    elif opcao == 4:
        print("Produtos Cadastrados:")
    elif opcao == 5:
        print("Opção 5 selecionada!")
    elif opcao == 6:
        print("Opção 6 selecionada!")
    elif opcao == 7:
        print("Saindo...")
        break
    else:
        print("Opção inválida!")