#15 cidades brasileiras em 2019
cont = 0
cidadesMenores = 0
numVeiculosPasseio = 0
totVeiculosPasseio = 0

while cont < 3:
    cidade = str(input("Digite o nome da cidade: "))
    numVeiculosPasseio = int(input("Digite o número de veículos de passeio: "))
    numAcidentesTransito = int(input("Digite o número de acidentes de trânsito: "))
    cont = cont + 1

    totVeiculosPasseio += numVeiculosPasseio

    # A) Qual a cidade que possui o maior número de acidentes de transito
    if numAcidentesTransito > numAcidentesTransito:
        print("A cidade com maior número de acidentes é ", cidade, " com ", numAcidentesTransito, " acidentes registrados.")

    #B) Qual a cidade que possui o menor número de acidentes de transito
    if numAcidentesTransito < numAcidentesTransito:
        print("A cidade com menor número de acidentes é ", cidade, " com ", numAcidentesTransito, " acidentes registrados.")

    #D) Qual a média de acidentes de transito nas cidades com menos de 2.000 veículos de passeio.
    if numVeiculosPasseio < 2000 and cont == 16:
        cidadesMenores += 1
        mediaAcidentes = numAcidentesTransito / cidadesMenores
        print("A média de acidentes em cidades com menos de 2.000 habitantes é: ", mediaAcidentes)

# C) Qual a média de veículos nas quinzes cidades juntas

mediaVeiculos = totVeiculosPasseio / cont
print("A média de veículos nas quinze cidades é: ", mediaVeiculos)