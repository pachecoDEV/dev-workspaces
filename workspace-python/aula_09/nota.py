trabalho = float(input("Digite sua nota do Trabalho de Laboratório: "))
semestral = float(input("Digite sua nota da Avaliação Semestral: "))
final = float(input("Digite sua nota do Exame Final: "))

media = ((trabalho * 2) + (semestral * 3) + (final * 5)) / 10

if media >= 8.0 and media <= 10.0:
    print("A média do aulno foi", media, "e conteito A.")
else:
    if media >= 7.0 and media <= 7.9:
        print("A média do aluno foi", media, "e conceito B.")
    else:
        if media >= 6.0 and media <= 6.9:
            print("A média do aluno foi", media, "e conceito C.")
        else:
            if media >= 5.0 and media <= 5.9:
                print("A média do aluno foi", media, "e conceito D.")
            else:
                print("A média do aluno foi", media, "e conceito E.")