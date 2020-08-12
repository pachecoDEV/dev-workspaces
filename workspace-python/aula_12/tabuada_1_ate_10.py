contador = 0
unidade = 0

while contador < 10:
    contador += 1
    while unidade < 11:
        tabuada = contador * unidade
        print(contador, " X ", unidade," = ", tabuada)
        unidade += 1
    unidade = 0
    unidade += 1

print("Cálculo da tabuada acabou!")