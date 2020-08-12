from random import randint

numero = int(randint(0, 99))
print(numero)

unidade = numero % 10
dezena = numero - unidade
dezena = dezena / 10
dezena = int(dezena % 10)

print(dezena)
print(unidade)
