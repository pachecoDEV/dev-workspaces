matriz = []

for i in range(5): # i=0 i=1 i=2 i=3 i=4
    linha = []
    for j in range(3):
        linha.append(0) # linha = [0,0,0]
    matriz.append(linha) # matriz = [0,0,0][0,0,0][0,0,0][0,0,0][0,0,0]
print(matriz)
print("\n")
for lista in matriz:
    for elemento in lista:
        print(elemento, end=' ')
    print()