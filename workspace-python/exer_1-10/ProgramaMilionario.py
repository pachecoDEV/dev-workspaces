salario = float(input("Digite o valor do seu salário: "))
despesas = float(input("Digite o valor das suas despesas: "))
sobra = salario - despesas
poupanca = 1000000 / sobra
num_arredondado = poupanca + 1
anos = num_arredondado / 12
meses = num_arredondado % 12
print(f"Você se tornará um milionário em {anos:.00f} anos e {meses:.00f} meses. ")