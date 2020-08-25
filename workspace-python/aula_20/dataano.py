def bissexto(ano):
    if(ano%4==0):
        if(ano%100==0):
            if(ano%400==0):
                return True
            else:
                return False
        else:
            return True
    else:
        return False

def dma(dia, mes, ano): # 16,01,1985
    if 31 >= dia >= 0:
        meses = ('Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro',
                 'Novembro', 'Dezembro')
        mesPorextenso = meses[mes - 1] # meses[4] # Maio (Índice começa em 0)
        if mesPorextenso == 'Fevereiro' and dia >= 30:
            print("Fevereiro só tem 29 ou 28 dias!")
        elif mesPorextenso == 'Fevereiro' and dia > 28 and bissexto(ano) == False:
            print("Fevereiro só tem 28 dias em anos não bissextos!")
        elif ((mesPorextenso == 'Abril' or mesPorextenso == 'Junho' or mesPorextenso == 'Setembro'
               or mesPorextenso == 'Novembro') and dia == 31):
            print("O Mes de ", mesPorextenso, " não tem 31 dias")
        else:
            print("%d de %s de %i" % (dia, mesPorextenso, ano))
    else:
        print("Dia inválido")

data = input("Digite uma data (dd/mm/aaaa): ")
dia, mes, ano = data.split('/') #16/01/1985
dma(int(dia), int(mes), int(ano))

