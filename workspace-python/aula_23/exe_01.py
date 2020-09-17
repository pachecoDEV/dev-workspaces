matriz = []
numIn = 0

while len(matriz) < 7:
    try:
        array = []
        while len(array) < 2:
            number = int(input("Digite um número: "))
            array.append(number)
            if 10 <= number <= 20:
                numIn = numIn + 1
        matriz.append(array)
    except:
        print("Insira apenas numeros inteiros!!!")
print("A quantidade de numeros entre 10 e 20 : " + str(numIn))
