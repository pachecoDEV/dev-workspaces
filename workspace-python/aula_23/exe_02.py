
matriza = [[0, 0], [0, 0]]
matrizb = [[0, 0], [0, 0]]
matrizc = [[0, 0], [0, 0]]

for linha in range(0, 2):
    for coluna in range(0, 2):
        matriza[linha][coluna] = (int(input("Digite um valor, sendo numero inteiro: ")))
for linha in range(0, 2):
    for coluna in range(0, 2):
        matrizb[linha][coluna] = (int(input("Digite um valor, sendo numero inteiro: ")))
for linha in range(0, 2):
    for coluna in range(0, 2):
        matrizc[linha][coluna] = matriza[linha][coluna] + matrizb[linha][coluna]

for lista in matriza:
    for elemento in lista:
        print(elemento, end=' ')
    print()

print(" + ")

for lista in matrizb:
    for elemento in lista:
        print(elemento, end=' ')
    print()

print(" = ")

for lista in matrizc:
    for elemento in lista:
        print(elemento, end=' ')
    print()
