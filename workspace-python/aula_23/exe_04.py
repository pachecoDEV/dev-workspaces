import random
n = 8
m = 8
matriz = []
for i in range(n):
    matriz.append([])
    for j in range(m):
        matriz[i].append(random.randint(-100, 100))
matriz2 = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4] + matriz[5][5] + matriz[6][6] + matriz[7][7] / 8
print("\n")
for lista in matriz:
    for elemento in lista:
        print(elemento, end=' ')
    print()
print(f"A média da diagonal principal: {matriz2}")
