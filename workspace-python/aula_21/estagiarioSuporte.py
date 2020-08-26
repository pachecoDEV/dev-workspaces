
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

while opcao != 4:
    numIdentificacao = int(input("Digite o número de identificação do ativo: "))
    totalAtivos += 1

    if numIdentificacao == 0:
        print("Programa Interrompido!")

        print("Quantidade de mouses: " + str(totalAtivos))

        print("Situação:                                  " + "Quantidade         " + "Percentual")
        print("1. Necessita da esfera.                    " + str(totDef1) + "                  " + str(pctDef1) + "%")
        print("2. Necessita de limpeza.                   " + str(totDef2) + "                  " + str(pctDef2) + "%")
        print("3. Necessita troca do cabo ou conector.    " + str(totDef3) + "                  " + str(pctDef3) + "%")
        print("4. Quebrado ou inutilizado.                " + str(totDef4) + "                  " + str(pctDef4) + "%")
        break

    print('\nMenu de defeitos')
    tipoDefeito = int(input("\t"
                      "1. Necessita da esfera.\n\t"
                      "2. Necessita de limpeza.\n\t"
                      "3. Necessita troca do cabo ou conector.\n\t"
                      "4. Quebrado ou inutilizado.\n\t"
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
    else:
        print("Opção inválida!")

    dictSucatas = {numIdentificacao: tipoDefeito}
