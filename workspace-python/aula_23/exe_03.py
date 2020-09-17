import random
n = 5
m = 5
matriz = []
for i in range(n):
  matriz.append([])
  for j in range(m):
    matriz[i].append(random.randint(0, 100))
matriz2 = matriz[0][4] + matriz[1][3] + matriz[2][2] + matriz[3][1] + matriz[4][0]
print("\n")
for lista in matriz:
  for elemento in lista:
    print(elemento, end=' ')
  print()
print(f"Soma da diagonal secundaria: {matriz2}")
