cont = 0
soma = 0
while(cont<50):
    idade = int(input("Insira sua idade: "))
    if(idade >= 0 and idade <= 122):
        cont = cont + 1
        soma = soma + idade
    else:
        print("Idade digitada inválida, tente novamente.")
media = idade / cont
print("A média simples das idades é ", media)