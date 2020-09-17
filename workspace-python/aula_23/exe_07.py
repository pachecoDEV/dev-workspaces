def ex7():
    matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for n in range(0, 3):
        for n2 in range(0, 3):
            matriz[n][n2] = int(input(f"Digite um número para [{n} x {n2}]: "))
    if len(matriz) == len(matriz[0]):
        print("\nMatriz quadrada")
    else:
        print("\nNão é uma matriz quadrada")


ex7()
