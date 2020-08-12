salario = float(input("Digite seu salário antes do aumento: "))
salario_novo = float(input("Digite seu salário atual: "))

pct_aumento = (salario_novo - salario) / salario * 100

print("O percentual do aumento foi de: ", pct_aumento, "%")
