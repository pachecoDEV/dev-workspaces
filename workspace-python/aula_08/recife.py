sal_bruto = float(input("Digite o valor do seu salário bruto: "))
prestacao = float(input("Digite o valor da prestação desejada: "))

if sal_bruto <= 0:
    print("Salário inválido.")
else:
    if prestacao <= 0:
        print("Valor da prestação inválida.")
    else:
        limite = sal_bruto * 30 / 100
        if prestacao <= limite:
            print("Empréstimo aprovado!")
        else:
            print("Empréstimo negado!")