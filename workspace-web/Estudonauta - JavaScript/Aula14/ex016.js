function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var res = document.getElementById('res')
    if (fano.value.length == 0 || Number(fano.value) > ano){
        window.alert('[ERRO] Verifique os dados e tente novamente!')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
        if (fsex[0].checked) {
            genero = 'Homem'
            if (idade >= 0 && idade < 2){
                img.setAttribute('src', 'img/homem_bebe.png')
            } else if (idade < 10) {
                img.setAttribute('src', 'img/homem_crianca.png')
            } else if (idade < 21) {
                img.setAttribute('src', 'img/homem_jovem.png')
            } else if (idade < 50) {
                img.setAttribute('src', 'img/homem_adulto.png')
            } else {
                img.setAttribute('src', 'img/homem_idoso.png')
            }

        } else if (fsex[1].checked) {
            genero = 'Mulher'
            if (idade >= 0 && idade < 2){
                img.setAttribute('src', 'img/mulher_bebe.png')
            } else if (idade < 10) {
                img.setAttribute('src', 'img/mulher_crianca.png')
            } else if (idade < 21) {
                img.setAttribute('src', 'img/mulher_jovem.png')
            } else if (idade < 50) {
                img.setAttribute('src', 'img/mulher_adulta.png')
            } else {
                img.setAttribute('src', 'img/mulher_idosa.png')
            }
        }
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }
}