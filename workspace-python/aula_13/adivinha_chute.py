numero = int(input("Digite um número para ser adivinhado: "))
chute = 0
cont = 0

while chute != numero:
    chute = int(input("Diga um chute para o número digitado: "))
    if chute < numero:
        print("*** CHUTOU BAIXO ***")
    else:
        print("*** CHUTOU ALTO ***")
    cont += 1

print("Acertou! Parabéns! Você precisou de ", cont, " chances.")