import CadastrarProdutos
import AlterarProduto
import ExcluirProduto
import ListarProdutos
import ComprarProduto
import VenderProduto

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
        
        CadastrarProdutos.cadastrarprodutos()

    elif opcao == 2:
        cont = 3
        senha = input("Digite sua senha: ")
        while senha != "yN1825*a" and cont > 1:
            print("Senha incorreta, você têm mais ", cont - 1, " tentativas.")
            senha = input("Digite novamente.\nSenha: ")
            cont = cont - 1
        if senha == "yN1825*a":
            print("Acesso permitido.")
            
            AlterarProduto.alterarproduto()

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

            ExcluirProduto.excluir_produto()

        else:
            print("SENHA BLOQUEADA!")

    elif opcao == 4:
        
        ListarProdutos.listarprodutos()

    elif opcao == 5:
        
        ComprarProduto.comprar_produto()

    elif opcao == 6:
        
        VenderProduto.vender_produto()

    elif opcao == 7:
        print("Saindo...")
        break

    else:
        print("Opção inválida!")
