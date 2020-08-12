from random import randint

cont = 0
contOtimo = 0
contPessimo = 0
idadeRuim = 0
mediaRuim = 0
pessimo = 0
bom = 0
regular = 0
pctPessimo = 0

while cont < 100:
    cont += 1
    idade = int(input("Digite sua idade: "))
    nota = str(input("Digite uma nota para o filme: "))

    if nota == "A":
        contOtimo += 1
    if nota == "B":
        bom += 1
    if nota == "C":
        regular += 1
    if nota == "D":
        idadeRuim = idadeRuim + idade
        mediaRuim = idadeRuim / 100
    if nota == "E":
        if idade > pessimo:
            pessimo = idade
        contPessimo += 1
        pctPessimo = contPessimo / cont

print("A quantidade de ótimo para o filme é: ", contOtimo)
print("A média de idade das pessoas que responderam ruim é: ", mediaRuim)
print("A porcentagem de pessoas que responderam péssimo é: ", contPessimo, "%")
print("A maior idade que avaliou como péssimo é: ", pessimo)
print("A quantidade de avaliações bom e regular é: ", bom + regular)