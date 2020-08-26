cont = 0
while cont <= 5:
    def consultara(ra):
        radict = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        if ra in radict:
            print("Aluno ATIVO!")
        else:
            print("Aluno INATIVO!")


    consultara(ra=int(input("Digite o RA do aluno: ")))
    cont += 1
print("Programa terminou.")

