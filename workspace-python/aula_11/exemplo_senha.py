cont = 3
senha = int(input("Digite sua senha: "))
while senha != 1214 and cont > 1:
    print("Senha incorreta, você têm mais ", cont-1, " tentativas.")
    senha = int(input("Digite novamente."))
    cont = cont - 1
if senha == 1214:
    print ("Acesso permitido!")
else:
    print("Senha bloqueada! Procure o setor responsável.")
