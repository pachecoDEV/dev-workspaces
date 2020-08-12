preco_litro = float(input("Informe o valor do preço por litro de combustível: "))
valor_abastec = float(input("Informe o valor que deseja abastecer: "))
litros_comprados = valor_abastec / preco_litro
print(f"Serão comprados {litros_comprados:.03f} litros de combustível")