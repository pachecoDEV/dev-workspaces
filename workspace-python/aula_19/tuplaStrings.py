def maiorStringTupla(tupla):
    maiorString = 0
    posicaoDaMaior = 0
    lista = list(tupla)
    for i in lista:
        if (len(i) > posicaoDaMaior):
            posicaoDaMaior = len(i)
            maiorString = i
    return maiorString

tupla = ("FIAP", "Vila Olímpia", "TDS", "Primeiro Ano")
print(maiorStringTupla(tupla))

