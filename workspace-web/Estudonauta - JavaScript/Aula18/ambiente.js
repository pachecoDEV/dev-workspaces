let num = [5,8,2,9,3]
num[5] = 6
num.push(4)
num.push(27)
console.log(num)
console.log(`Nosso vetor contém os seguintes elementos: ${num}`)
console.log(`Nosso vetor têm a seguinte quantidade de elementos: ${num.length}`)

Number(num.sort())
console.log(`Nosso vetor foi organizado de forma crescente: ${num}`)

let pos = num.indexOf(8)
console.log(`O valor 8 está na posição ${pos}`)

