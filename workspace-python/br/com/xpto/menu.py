opcao = 0

while opcao != 7:
    print("**** MENU ****")
    print("1 - Cadastrar Produto")
    print("2 - Alterar Produto")
    print("3 - Excluir Produto")
    print("4 - Listar Estoque de Peças")
    print("5 - Comprar Produto")
    print("6 - Vender Produto")
    print("7 - Sair")
    opcao = int(input("Qual a opção desejada?"))
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
        print("Opção 3 selecionada!")
    elif opcao == 4:
        print("Opção 4 selecionada!")
    elif opcao == 5:
        print("Opção 5 selecionada!")
    elif opcao == 6:
        print("Opção 6 selecionada!")
    elif opcao == 7 :
        print("Saindo...")
    else:
        print("Opção inválida!")