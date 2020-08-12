sports = ("Futebol", "Vôlei", "Basquete", "Golf", "Beiseball", "Poker")

print("**USANDO WHILE**")
i = 0
while i < len(sports):
    print(sports[i])
    i = i + 1

print("**USANDO FOR**")
for c in sports:
    print(c)