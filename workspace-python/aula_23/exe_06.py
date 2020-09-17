matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
for n in range(0, 4):
    for n2 in range(0, 4):
        matriz[n][n2] = int(input(f"Digite um número para [{n} x {n2}]: "))
for n in range(0, 4):
    for n2 in range(0, 4):
        print(f"[{matriz[n][n2]:^5}]", end='')
    print()
diagonalP = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3]
diagonalS = matriz[0][3] + matriz[1][2] + matriz[2][1] + matriz[3][0]
linha = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0]
linha2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1]
linha3 = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2]
linha4 = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3]
coluna = matriz[0][0] + matriz[0][0] + matriz[0][0] + matriz[0][0]
coluna2 = matriz[0][1] + matriz[0][1] + matriz[0][1] + matriz[0][1]
coluna3 = matriz[0][2] + matriz[0][2] + matriz[0][2] + matriz[0][2]
coluna4 = matriz[0][3] + matriz[0][3] + matriz[0][3] + matriz[0][3]
if diagonalP == diagonalS == linha == linha2 == linha3 == linha4 == coluna == coluna2 == coluna3 == coluna4:
    print("\n\033[32mÉ um quadrado mágico\033[m")
else:
    print("\n\033[31mNão é um quadrado mágico\033[m")
