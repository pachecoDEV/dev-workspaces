function verificar(){
    var agora = new Date()
    var diaSem = agora.getDay()
    var res = document.getElementById('res')

    switch(diaSem){
    case 0:
        res.innerHTML = 'Domingo'
        break
    case 1:
        res.innerHTML = 'Segunda-Feira'
        break
    case 2:
        res.innerHTML = 'Terça-Feira'
        break
    case 3:
        res.innerHTML = 'Quarta-Feira'
        break
    case 4:
        res.innerHTML = 'Quinta-Feira'
        break
    case 5:
        res.innerHTML = 'Sexta-Feira'
        break
    case 6:
        res.innerHTML = 'Sábado'
        break
    }
}