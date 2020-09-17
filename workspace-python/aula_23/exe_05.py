import random
listNotOrdered = []
column = []
matrix = []
while len(listNotOrdered) < 20:
    number = random.randint(0, 100)
    listNotOrdered.append(number)
listOrdered = sorted(listNotOrdered)
print(listOrdered)
for i in range(0, len(listOrdered)):
    column.append(listOrdered[i])
    if i == 4 or i == 9 or i == 14 or i == 19:
        matrix.append(column)
        column = []
print(matrix)
