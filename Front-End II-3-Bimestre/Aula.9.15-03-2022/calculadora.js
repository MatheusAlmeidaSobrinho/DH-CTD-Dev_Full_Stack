let n1 = document.getElementById('n1')
let n2 = document.getElementById('n2')

let fSoma = document.getElementById('bSoma')
let fSubtracao = document.getElementById('bSubtracao')
let fMultiplicacao = document.getElementById('bMultiplicacao')
let fDivisao = document.getElementById('bDivisao')

fSoma.onclick = function () {
  alert(`O resultado é ${somar(n1.value, n2.value)}`)
  console.log(`O resultado é ${somar(n1.value, n2.value)}`)
}

fSubtracao.onclick = function () {
  alert(`O resultado é ${subtrair(n1.value, n2.value)}`)
  console.log(`O resultado é ${somar(n1.value, n2.value)}`)
}

fMultiplicacao.onclick = function () {
  alert(`O resultado é ${multiplicar(n1.value, n2.value)}`)
  console.log(`O resultado é ${somar(n1.value, n2.value)}`)
}

fDivisao.onclick = function () {
  alert(`O resultado é ${dividir(n1.value, n2.value)}`)
  console.log(`O resultado é ${somar(n1.value, n2.value)}`)
}
// Só inseri o console.log nas funcões por que o exercicio pedia para exibir pelo console,
// preferi fazer pelo alert, estou terminando de fazer para exibir na tela numa nova div
// mais como precisar ser entregue por agora só cheguei ate aqui.
