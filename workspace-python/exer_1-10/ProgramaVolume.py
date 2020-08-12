import math
altura = float(input("Digite a altura da lata:"))
raio = float(input("Digite o raio da lata:"))
volume = math.pi * (raio * raio) * altura
print(f"O volume da garrafa é de: {volume:.03f}")