# Faça um programa em Python que mostre uma lista de preços de produtos.
# Observação: Obrigatório fazer apenas 1 (uma) tupla. O relatório precisa estar conforme exemplo abaixo.
# 
# ----------------------------------
#          LISTA DE PREÇOS
# ----------------------------------
# PRODUTO1................ R$  10.75
# PRODUTO2................ R$   9.78
# PRODUTO3................ R$ 100.60
# ----------------------------------
# TOTAL................... R$ 121.13 
#
# * Fazer com o menor número de linhas que conseguir!


t_produtos = ("PRODUTO1", "PRODUTO2", "PRODUTO3")
l_precos = [10.75, 9.78, 100.60]

total = l_precos[0] + l_precos[1] + l_precos[2]

print("----------------------------------")
print("         LISTA DE PREÇOS")
print("----------------------------------")
print(t_produtos[0] + "................ R$  " + str(l_precos[0]))
print(t_produtos[1] + "................ R$   " + str(l_precos[1]))
print(t_produtos[2] + "................ R$  " + str(l_precos[2]))
print("----------------------------------")
print("TOTAL................... R$  " + str(total))

