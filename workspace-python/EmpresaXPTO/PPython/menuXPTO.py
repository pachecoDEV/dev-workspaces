import cadastrarproduto
import alterarproduto
import removeproduto

opcao = 0

codproduto = []
descproduto = []
qtdeproduto = []
produtos = (codproduto, descproduto, qtdeproduto)

while opcao != 7:
    print('\nMenu')
    opcao = int(input(
        "\t1. Cadastrar Produto\n\t2. Alterar Produto\n\t3. Excluir Produto\n\t4. Listar Estoque de Peça\n\t5. Comprar Produto\n\t6. Vender Produto\n\t7. Sair\n\tDigite a opção desejada: "))
    if opcao == 1:
        cadastrarproduto.cadastrarprodutos()

    elif opcao == 2:
        senha = input("Digite sua Senha: ")
        if senha == "yN1825*a":
            print("Acesso permitido.")
            alterarproduto.alterarproduto()
        else:
            print("SENHA INCORRETA")

    elif opcao == 3:
        senha = input("Digite sua Senha: ")
        if senha == "yN1825*a":
            print("ACESSO PERMITIDO")
            removeproduto.removerproduto()
        else:
            print("SENHA INCORRETA")
            
    elif opcao == 4:
        print(sorted(produtos))

    elif opcao == 5:
        print("Comprar produto")

    elif opcao == 6:
        print("Vender produto")

    elif opcao == 7:
        print("Saindo...")
        break

    else:
        print("Opção inválida!")
