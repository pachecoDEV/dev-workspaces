def mediaTupla (tupla):
    lista = list(tupla)
    media = sum(lista) / len(lista)
    return media

tupla = (1.8, 2, 3, 4.2)
print(mediaTupla(tupla))
