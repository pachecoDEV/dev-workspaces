print("Bem-vindo a empresa FOGUETE, escolha abaixo a opção que deseja para aquisição das passagens")

janela = [0] * 24
corredor = [0] * 24
opcao = 0

while opcao != 5:
    print('-' * 35)
    print('''    [1] Vender passagem
    [2] Cancelar compra
    [3] Mostrar mapa de ocupação
    [4] Sair''')
    print('-' * 35)
    opcao = int(input('Qual é a sua opção? '))
    if opcao == 1:
        if janela == [1] * 24 and corredor == [1] * 24:
            print("\033[31mÔnibus lotado. Opção inválida!\033[m")
        else:
            print('-' * 20)
            print('''    [1] Janela
    [2] Corredor''')
            print('-' * 20)
            fileira = int(input("Qual fileira deseja? "))
            if fileira == 1:
                poltrona = int(input("Qual o número da poltrona deseja? "))
                poltrona = (poltrona - 1)
                if janela[poltrona] == 1:
                    print("\033[31mPoltrona ocupada. Venda não realizada!\033[m")
                else:
                    janela[poltrona] = 1
                    print("\033[32mVenda realizada com sucesso!\033[m")
            elif fileira == 2:
                poltrona = int(input("Qual o número da poltrona deseja? "))
                poltrona = (poltrona - 1)
                if corredor[poltrona] == 1:
                    print("\033[31mPoltrona ocupada. Venda não realizada!\033[m")
                else:
                    corredor[poltrona] = 1
                    print("\033[32mVenda realizada com sucesso!\033[m")
    elif opcao == 2:
        if janela == [0] * 24 and corredor == [0] * 24:
            print("\033[31mTodas as poltronas estão livres. Opção inválida!\033[m")
        else:
            print('-' * 20)
            print('''    [1] Janela
    [2] Corredor''')
            print('-' * 20)
            fileira = int(input("Qual fileira deseja? "))
            if fileira == 1:
                poltrona = int(input("Qual o número da poltrona deseja? "))
                poltrona = (poltrona - 1)
                if janela[poltrona] == 0:
                    print("\033[31mPoltrona livre. Compra não cancelada!\033[m")
                else:
                    janela[poltrona] = 0
                    print("\033[32mCompra cancelada com sucesso! \033[m")
            elif fileira == 2:
                poltrona = int(input("Qual o número da poltrona deseja? "))
                poltrona = (poltrona - 1)
                if corredor[poltrona] == 0:
                    print("\033[31mPoltrona livre. Compra não cancelada!\033[m")
                else:
                    corredor[poltrona] = 0
                    print("\033[32mCompra cancelada com sucesso! \033[m")

    elif opcao == 3:
        janela_ocupada = janela
        print("Janela: ")
        for (i, janela_ocupada) in enumerate(janela_ocupada, start=1):
            print(i, "-", str(janela_ocupada).replace("1", "Ocupado").replace("0", "Livre"))
        corredor_ocupado = corredor
        print("\nCorredor: ")
        for (i, corredor_ocupado) in enumerate(corredor_ocupado, start=1):
            print(i, "-", str(corredor_ocupado).replace("1", "Ocupado").replace("0", "Livre"))

    elif opcao == 4:
        print('\nSaindo do programa...')
        break
    else:
        print('\n\033[31mVocê escolheu uma opção inválida!!!\033[m')