def crime(lista):
    valor=lista.count("sim")
    if valor==2:
        classi="Suspeita"
    elif valor==3 or valor==4:
        classi="Cúmplice"
    elif valor== 5:
        classi="Assasino"
    else:
        classi="Inocente"
    return classi

a=input("Telefonou para a vítima? ")
b=input("Esteve no local do crime? ")
c=input("Mora perto da vítima? ")
d=input("Devia para a vítima? ")
e=input("Já trabalhou com a vitima? ")
lista=[a, b, c, d, e]
print(lista)
partici_classi=crime(lista)
print("Classificação sobre a participação",partici_classi)