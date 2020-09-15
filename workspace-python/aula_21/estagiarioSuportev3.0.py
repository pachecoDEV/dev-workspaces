
opcao = 0
totalAtivos = 0
totDef1 = 0
pctDef1 = 0
totDef2 = 0
pctDef2 = 0
totDef3 = 0
pctDef3 = 0
totDef4 = 0
pctDef4 = 0
totDef5 = 0
pctDef5 = 0
dictSucatas = {}

while opcao != 5:
    numIdentificacao = int(input("Digite o número de identificação do ativo: "))
    totalAtivos += 1

    if numIdentificacao == 0:
        print("Programa Interrompido!\n\t")

        print("---- Identificação dos mouses sem defeito ----")
        if totDef5 == 0:
            print("Nenhum")
            print("Total: -----")
        else:
            for (chave, valor) in dictSucatas.items():
                if (valor == 5):
                    print(chave)
            print("Total: " + str(totDef5) + " mouse(s)." + "\n\t")

        print("---- Identificação dos mouses que necessitam de esfera ----")
        if totDef1 == 0:
            print("Nenhum")
            print("Total: -----")
        else:
            for (chave, valor) in dictSucatas.items():
                if (valor == 1):
                    print(chave)
            print("Total: " + str(totDef1) + " mouse(s)." + "\n\t")

        print("---- Identificação dos mouses que necessitam de limpeza ----")
        if totDef2 == 0:
            print("Nenhum")
            print("Total: -----")
        else:
            for (chave, valor) in dictSucatas.items():
                if (valor == 2):
                    print(chave)
            print("Total: " + str(totDef2) + " mouse(s)." + "\n\t")

        print("---- Identificação dos mouses que necessitam troca de cabo ou conector ----")
        if totDef3 == 0:
            print("Nenhum")
            print("Total: -----")
        else:
            for (chave, valor) in dictSucatas.items():
                if (valor == 3):
                    print(chave)
            print("Total: " + str(totDef3) + " mouse(s)." + "\n\t")

        print("---- Identificação dos mouses que estão quebrados ou inutilizados ----")
        if totDef4 == 0:
            print("Nenhum")
            print("Total: -----")
        else:
            for (chave, valor) in dictSucatas.items():
                if (valor == 4):
                    print(chave)
            print("Total: " + str(totDef4) + " mouse(s)." + "\n\t")

        print("Quantidade total de mouse(s): " + str(totalAtivos) + "\n\t")
        print("% de mouses sem defeito: " + str(pctDef5) + "%\n\t")
        print("% de mouses com apenas um defeito: ")

        break

    print('\nMenu de defeitos')
    tipoDefeito = int(input("\t"
                      "1. Necessita da esfera.\n\t"
                      "2. Necessita de limpeza.\n\t"
                      "3. Necessita troca do cabo ou conector.\n\t"
                      "4. Quebrado ou inutilizado.\n\t"
                      "5. Sem defeito.\n\t"
                      "Digite a opção desejada: "))
    if tipoDefeito == 1:
        totDef1 = totDef1 + 1
        pctDef1 = (totalAtivos / totDef1) * 100
    elif tipoDefeito == 2:
        totDef2 = totDef2 + 1
        pctDef2 = (totalAtivos / totDef2) * 100
    elif tipoDefeito == 3:
        totDef3 = totDef3 + 1
        pctDef3 = (totalAtivos / totDef3) * 100
    elif tipoDefeito == 4:
        totDef4 = totDef4 + 1
        pctDef4 = (totalAtivos / totDef4) * 100
    elif tipoDefeito == 5:
        totDef5 = totDef5 + 1
        pctDef5 = (totalAtivos / totDef5) * 100
    else:
        print("Opção inválida!")

dictSucatas[numIdentificacao] = tipoDefeito