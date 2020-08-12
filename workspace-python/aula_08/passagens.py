destino = int(input("Qual o seu destino? 1. Norte - 2. Nordeste - 3. Centro-Oeste "))
passagem = int(input("Informe o trecho de sua passagem: 1. Ida - 2. Ida e Volta "))

if destino == 1 and passagem == 1:
    print("O valor de sua passagem é de R$280,00.")
else:
    if destino == 1 and passagem == 2:
        print("O valor da sua passagem é de R$400,00")
    else:
        if destino == 2 and passagem == 1:
            print("O valor da sua passagem é de R$380,00")
        else:
            if destino == 2 and passagem == 2:
                print("O valor da sua passagem é de R$628,00")
            else:
                if destino == 3 and passagem == 1:
                    print("O valor da sua passagem é de R$620,00")
                else:
                    print("O valor da sua passagem é de R$1.100,00")