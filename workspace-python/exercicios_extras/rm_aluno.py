rm = int(input("Digite o seu RM: "))

unidade = rm % 10
rm = (rm - unidade) / 10

dezena = rm % 10
rm = (rm - dezena) / 10

centena = rm % 10
rm = (rm - centena) / 10

milhar = rm % 10
rm = (rm - milhar) / 10

milhao = rm % 10
rm = (rm - milhao) / 10

dezena = int(dezena)
centena = int(centena)
milhar = int(milhar)
milhao = int(milhao)

soma = unidade + dezena + centena + milhar + milhao

print(milhao, "milhao(ões)", milhar, "milhar(es)", centena, "centena(s)", dezena, "dezena(s)", unidade, "unidade(s).")
print(soma, "=", milhao, "+", milhar, "+", centena, "+", dezena, "+", unidade)