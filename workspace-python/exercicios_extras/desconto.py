preco = float(input("Digite o preço do produto: "))
desconto = float(input("Digite o percentual do desconto: "))
acrescimo = float(input("Digite o percentual do acréscimo: "))

print("O preço original do produto é: R$", preco)

desconto = desconto / 100
vl_desconto = preco * desconto
preco_final = preco - vl_desconto

print("O valor do desconto é de: R$", vl_desconto)
print("O valor com o desconto aplicado é de: R$", preco_final)

acrescimo = acrescimo / 100
vl_acrescimo = preco * acrescimo
preco_final = preco + vl_acrescimo

print("O valor do aumento é de: R$", vl_acrescimo)
print("O valor com o acréscimo é de: R$", preco_final)
