function verificar() {
    var pais = document.getElementById('txtnac')
    var res = document.getElementById('res')
    var txt = String(pais.value)
    var txt2 = 'Brasil'
    res.innerHTML = `Sua nacionalidade é <strong>${txt}</strong><br>`

    if (txt == txt2) {
        res.innerHTML += `Você é brasileiro.`
    } else {
        res.innerHTML += `Você é estrangeiro.`
    }
}