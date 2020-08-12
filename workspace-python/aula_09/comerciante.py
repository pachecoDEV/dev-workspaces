vl_produto = float(input("Digite o valor do produto: "))

if vl_produto < 20.0:
    vl_venda = vl_produto * 0.45
    vl_venda = vl_produto + vl_venda
    print("O valor de venda do produto é: R$", vl_venda)
else:
    vl_venda = vl_produto * 0.30
    vl_venda = vl_produto + vl_venda
    print("O valor ded venda do produto é: R$", vl_venda)