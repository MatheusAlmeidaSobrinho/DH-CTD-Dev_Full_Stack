var botao = document.querySelector('button')

function random(cor) {
  return Math.floor(Math.random() * (cor + 1))
}

botao.onclick = function () {
  var corAleatoria =
    'rgb(' + random(255) + ',' + random(255) + ',' + random(255) + ')'
  document.body.style.backgroundColor = corAleatoria
}
