
var div1 = document.getElementById('div-1')

function clique() {
    document.body.style.background = 'black'
    document.body.style.color = 'white'
}

function volte() {
    document.body.style.background = 'white'
    document.body.style.color = 'black'
    var foto = document.createElement('img')
    foto.src = 'mulher_idosa.png'
    div1.appendChild(foto)
    div1.innerHTML += 'Chupa boy!!!'
    div1 = ''
}

