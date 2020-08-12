def maior(lista):
    num = lista[0]
    indice = 0
    for i in range(len(lista)):
        if(lista[i]>num):
            num=lista[i]
            indice=i
    return num, indice

l = (50,20,9,7,74,60)
maior_numero = maior(l)
print("Maior número: ", maior_numero)

