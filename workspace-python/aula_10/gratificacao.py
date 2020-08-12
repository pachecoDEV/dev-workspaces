horasExtras = int(input("Digite o número de horas extras trabalhadas: "))
horasFaltas = int(input("Digite o número de horas sem trabalhar: "))

horasExtras = horasExtras * 60
horasFaltas = horasFaltas * 60

print("Você trabalhou ", horasExtras, " minutos.")
print("Você faltou ", horasFaltas, " minutos.")

premio = horasExtras - (2 / 3 * (horasExtras - horasFaltas))

if premio > 2400:
    print("O seu prêmio é de R$1.500,00")
elif premio >= 1800 and premio < 1399:
    print("O seu prêmio é de R$1.000,00")
elif premio >= 1200 and premio < 1799:
    print("O seu prêmio é de R$890,00")
else:
    print("O seu prêmio é de R$500,00")