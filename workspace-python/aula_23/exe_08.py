def ex8():
    matriz = [[2, 2, 0], [0, 0, 0], [2, 2, 2]]
    contador = 0
    for i in range(0,len(matriz)):
        for j in range(0,len(matriz[0])):
            if matriz[i][j]==0:
                contador = contador+1
    return contador


ex8()
