a_vista = float(input("Digite o valor a ser pago à vista: "))
parcelado = float(input("Digite o valor da parcela: "))

parcelado = parcelado * 10

desconto = (parcelado - a_vista) / a_vista *100

print("O valor à vista têm", desconto, "% de desconto.")