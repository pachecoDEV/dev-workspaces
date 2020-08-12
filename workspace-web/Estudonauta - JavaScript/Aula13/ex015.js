function carregar(){
    var msg = document.getElementById('msg')
    var imagem = document.getElementById('imagem')
    var data = new Date()
    var horas = data.getHours()
    var minutos = data.getMinutes()
    msg.innerHTML = `Agora são ${horas}:${minutos} horas.`
    if (hora >= 0 && hora < 12) {
        //Bom dia
        imagem.src = 'img/amanhecer.png'
        document.body.style.background = 'rgb(252,230,103)'
    } else if (hora >= 12 && hora <= 18) {
        //Boa tarde
        imagem.src = 'img/entardecer.png'
        document.body.style.background = 'rgb(243,154,31)'
    } else {
        //Boa noite
        imagem.src = 'img/anoitecer.png'
        document.body.style.background = 'rgb(132,144,169)'
    }
}