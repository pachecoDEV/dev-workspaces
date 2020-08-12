nome = input("Digite seu nome: ")
nota_1 = float(input("Digite a primeira nota: "))
nota_2 = float(input("Digite a segunda nota: "))
nota_3 = float(input("Digite a terceira nota: "))
faltas = int(input("Digite a quantidade de faltas: "))
aulas = 80

rep_faltas = aulas * 0.25
media = (nota_1 + nota_2 + nota_3) / 3

if faltas >= rep_faltas:
    print("O aluno está reprovado por faltas. Faltas:", faltas)
elif media <= 6.9:
    print("O aluno foi reprovado por nota. Média:", media)
elif media >= 7.0:
    print("O aluno foi aprovado. Média:", media)