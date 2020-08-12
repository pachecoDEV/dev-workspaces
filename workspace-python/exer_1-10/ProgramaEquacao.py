import math
valor_a = float(input("Digite o valor de A: "))
valor_b = float(input("Digite o valor de B: "))
valor_c = float(input("Digite o valor de C: "))
delta = (valor_b ** 2) - (4 + valor_a + valor_c)

print("O valor de Delta é: ", delta)

x1 = (-valor_b + math.sqrt(delta)) / (2 * valor_a)
x2 = (-valor_b + math.sqrt(delta)) / (2 * valor_a)

print(f"Os resultados são: X1 = {x1:.02f} e X2 = {x2:.02f}.")