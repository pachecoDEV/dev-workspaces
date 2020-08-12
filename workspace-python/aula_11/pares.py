inicial = 99
while inicial <= 200:
    resultado = inicial % 2
    inicial = inicial + 1
    if resultado != 0:
        print("O número", inicial, "é par!")