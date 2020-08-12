function calcular(){
    var txtv = document.getElementById('txtvel')
    var res = document.getElementById('res')
    var vel = Number(txtv.value)
    res.innerHTML = `Sua velocidade atual é de <strong>${vel}</strong> Km/h<br>`
    if (vel > 60) {
        res.innerHTML += `Você foi <strong>MULTADO</strong> por excesso de velocidade.`    
    } else {
        res.innerHTML += `Dirija sempre com cinto de segurança!`
    }
}

