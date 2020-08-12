"""
10) Escreva um algoritmo que solicite
n idades. Mostrar na tela:
A) Quantas pessoas possuem 18 anos
B) Quantas pessoas possuem mais de 18 anos
C) Quantas pessoas possuem menos de 18 anos
D) Soma das idades digitadas
E) Média das idades digitadas
F) Maior idade e quantas pessoas possuem essa idade
G) Menor idade e quantas pessoas possuem essa idade
Observação:
n é um número também fornecido pelo usuário. Por exemplo, se o
usuário digitar 15 para n , você terá que solicitar 15
"""

qtdeIdades = int(input("Digite a quantidade de idades que deseja calcular: "))

cont = 0
contDezoito = 0
contMaiorDezoito = 0
contMenorDezoito = 0
somaIdade = 0
mediaIdade = 0
maiorIdade = 0
contMaiorIdade = 0
contMenorIdade = 0
menorIdade = 200

while qtdeIdades >= cont:
    cont += 1
    idade = int(input("Digite a idade que deseja calcular: "))
    if idade == 18:
        contDezoito += 1

    if idade > 18:
        contMaiorDezoito += 1

    if idade < 18:
        contMenorDezoito += 1

    somaIdade = somaIdade + idade

    mediaIdade = somaIdade / qtdeIdades

    if idade > maiorIdade:
        maiorIdade = idade
        contMaiorIdade += 1

    if idade < menorIdade:
        menorIdade = idade
        contMenorIdade += 1


print("A quantidade de pessoas com 18 anos é: ", contDezoito)
print("A quantidade de pessoas com mais de 18 anos é: ", contMaiorDezoito)
print("A quantidade de pessoas com menos de 18 anos é: ", contMenorDezoito)
print("A soma das idades digitadas é: ", somaIdade)
print("A média das idades digitadas é: ", mediaIdade)
print("A maior idade digita é: ", maiorIdade)
print("A quantidade de pessoas com essa idade é: ", contMaiorIdade)
print("A menor idade digita é: ", menorIdade)
print("A quantidade de pessoas com essa idade é: ", contMenorIdade)
