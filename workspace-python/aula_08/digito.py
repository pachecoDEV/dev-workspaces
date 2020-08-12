conta = int(input("Digite o número de sua conta: "))

# *** Separação das unidades do número ***
unidade = conta % 10
conta = (conta - unidade) / 10
dezena = conta % 10
conta = (conta - dezena) / 10
centena = conta % 10
conta = (conta - centena) / 10
unidade = int(unidade)
dezena = int(dezena)
centena = int(centena)

# *** Soma do número da conta com o seu inverso ***
soma = int((str(centena) + str(dezena) + str(unidade))) + int((str(unidade) + str(dezena) + str(centena)))
print(soma)

# *** Multiplicação de cada digito da soma pela sua ordem posicional ***
unidade = soma % 10
soma = (soma - unidade) / 10
dezena = soma % 10
soma = (soma - dezena) / 10
centena = soma % 10
soma = (soma - centena) / 10

unidade = int(unidade)
dezena = int(dezena)
centena = int(centena)

multi = (centena * 1) + (dezena * 2) + (unidade * 3)
print(multi)

# *** Separando os dígitos da multiplicação feita ***
unidade = multi % 10
multi = (multi - unidade) / 10
dezena = multi % 10
multi = (multi - dezena) / 10
centena = multi % 10
multi = (multi - centena) / 10

unidade = int(unidade)
dezena = int(dezena)
centena = int(centena)
print(centena, dezena, unidade)

print("O dígito verificador da sua conta é: ", unidade)
