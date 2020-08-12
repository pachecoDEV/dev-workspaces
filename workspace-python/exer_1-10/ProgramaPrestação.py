valor_boletos = int(input("Digite o valor original do boleto:"))
juros = float(input("Digite o valor dos juros cobrados:"))
dias = int(input("Digite a quantidade de dias atrasados:"))
valor_atual = valor_boletos + (valor_boletos * juros / 1000) * dias
print(f"O valor atualizado para pagamento é: {valor_atual}")