# Solução 1
print("**SOLUÇÃO 1**")

nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")
combinacoes = []
for i in nomes:
    for j in range(len(nomes)):
        if f"{nomes[j]} e {i}" in combinacoes or nomes[j] == i:
            continue
        combinacoes.append(f"{i} e {nomes[j]}")
print(combinacoes)


# Solução 2
print("**SOLUÇÃO 2**")

nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")

def dupla(nomes):
    for x in nomes:
        for y in nomes:
            if x != y:
                if nomes.index(y) > nomes.index(x):
                    print(x + " e " + y)
nome_teste = dupla(nomes)

# Solução 3
print("**SOLUÇÃO 3**")

def combinacoes(nomes):
    for a in range(len(nomes)):
        for b in range(len(nomes)):
            if (nomes[a] != nomes[b] and (b > a)):
                print(nomes[a], "e", nomes[b])

nomes = ("Ana", "Bia", "Celi", "Diana", "Eva", "Fabia")
combinacoes(nomes)

