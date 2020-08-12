function verificar() {
    var idade = document.getElementById('idade')
    var res = document.getElementById('res')
    var verIdade = Number(idade.value)
    res.innerHTML = `Você têm ${verIdade} anos.<br>`
    
    if (verIdade < 16) {
        res.innerHTML = 'Você ainda não pode votar.'
    } else if (verIdade < 18 || verIdade > 65) {
        res.innerHTML = 'Seu voto é opcional.'
    } else {
        res.innerHTML = 'Seu voto é obrigatório.'
    }
}