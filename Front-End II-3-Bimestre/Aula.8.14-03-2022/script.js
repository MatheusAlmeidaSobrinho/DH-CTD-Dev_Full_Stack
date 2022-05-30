/*
Crie um formulário com campos de input e botões de submit e reset. XXXX

Previna a página de ser recarregada quando houver o submit utilizando preventDefault(). XXXX

Mostre um alerta na página quando a tela terminar de ser carregada. XXXX

Adicione uma cor a um texto quando o mouse ficar acima do mesmo e outra cor quando ele sair do mesmo. XXXX

Faça um trecho de código que utilize algum evento de teclado, esse evento irá escrever o conteúdo do input em uma tag <p> e logo abaixo o número de vezes que esse evento foi chamado. Exemplo: <p>futebol</p> <p>7</p>.
*/

window.onload = function () {
  alert('A pagina foi carregada!')
}

let naoRecarregar = document.getElementById('botaoEnviar')

naoRecarregar.addEventListener('click', function (batatinha) {
  alert('ta funfando')
  batatinha.preventDefault()
})

let mudarCorFundotexto = document.getElementById('inputNome')

mudarCorFundotexto.onmouseover = function () {
  console.log('Cursor em cima do botão de enviar')
  mudarCorFundotexto.style.backgroundColor = 'blue'
}

let mudarCorFundotextoSair = document.getElementById('inputNome')

mudarCorFundotextoSair.onmouseout = function () {
  console.log('Cursor em cima do botão de enviar')
  mudarCorFundotextoSair.style.backgroundColor = 'white'
}
