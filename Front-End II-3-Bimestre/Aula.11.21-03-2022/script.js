let dados = document.querySelector('.dados')
let botao = document.getElementById('meuBotaoSubmit')

let texto = document.getElementById('text')
let numero = document.getElementById('number')
let email = document.getElementById('email')
let data = document.getElementById('date')

botao.addEventListener('click', evento => evento.preventDefault())

function adicionarCard() {
  let div = document.createElement('div')
  div.innerHTML = ` cliente: ${texto.value} portador do numero: ${numero.value} 
  \n Email: ${email.value} nascido em: ${data.value}`
  dados.appendChild(div)
}

botao.addEventListener('click', () => adicionarCard())
