# Solução 1
nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")
combinacoes = []
for i in nomes:
    for j in range(len(nomes)):
        if f"{nomes[j]} e {i}" in combinacoes or nomes[j] == i:
            continue
        combinacoes.append(f"{i} e {nomes[j]}")
print(combinacoes)


# Solução 2
nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")
