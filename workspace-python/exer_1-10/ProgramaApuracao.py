candidato_a = int(input("Digite o total de votos recebidos para o candidato A: "))
candidato_b = int(input("Digite o total de votos recebidos para o candidato B: "))
candidato_c = int(input("Digite o total de votos recebidos para o candidato C: "))
branco = int(input("Digite o total de votos em BRANCO: "))
nulo = int(input("Digite o total de votos NULO: "))

total_votos = candidato_a + candidato_b + candidato_c + branco + nulo
total_votos_validos = total_votos - (branco + nulo)

print(f"O total de votos apurados foi de {total_votos} e o total de votos válidos foi de {total_votos_validos}.")

por_cadidato_a = candidato_a / total_votos
por_cadidato_a = por_cadidato_a * 100
total_votos_validos_a = candidato_a / total_votos_validos
total_votos_validos_a = total_votos_validos_a * 100
print(f"O candidato A obteve {por_cadidato_a:.02f}% do total de votos.")
print(f"O candidato A obteve {total_votos_validos_a:.02f}% dos votos válidos.")

por_cadidato_b = candidato_b / total_votos
por_cadidato_b = por_cadidato_b * 100
total_votos_validos_b = candidato_b / total_votos_validos
total_votos_validos_b = total_votos_validos_b * 100
print(f"O candidato A obteve {por_cadidato_b:.02f}% do total de votos.")
print(f"O candidato A obteve {total_votos_validos_b:.02f}% dos votos válidos.")

por_cadidato_c = candidato_c / total_votos
por_cadidato_c = por_cadidato_c * 100
total_votos_validos_c = candidato_c / total_votos_validos
total_votos_validos_c = total_votos_validos_c * 100
print(f"O candidato A obteve {por_cadidato_c:.02f}% do total de votos.")
print(f"O candidato A obteve {total_votos_validos_c:.02f}% dos votos válidos.")

por_branco = branco / total_votos
por_branco = por_branco * 100
print(f"A porcentagem de votos em BRANCO é de {por_branco:.02f}% dos votos.")

por_nulo = nulo / total_votos
por_nulo = por_nulo * 100
print(f"A porcentagem de votos NULO é de {por_nulo:.02f}% dos votos.")