//DARK MODE

const btn = document.getElementById('btn')

btn.addEventListener('change', e => {
  document.body.classList.toggle('dark', e.target.checked)
})

//CRIAÇÃO DE CARDS

let enviarCard = document.getElementById('botaoSubmit')
let areaCard = document.getElementById('containerItens')
let urlImagem = document.getElementById('campoImagem')
let titulo = document.getElementById('campoTitulo')
let album = document.getElementById('campoAlbum')
let areaTexto = document.getElementById('textArea')

enviarCard.addEventListener('click', evento => evento.preventDefault())

function adicionarCard() {
  let div = document.createElement('div')
  div.innerHTML = `
  <div class="card">
  <img src="${urlImagem.value}" alt="">
  <h2>${titulo.value}</h2>
  <h3>${album.value}</h3>
  <p>${areaTexto.value}</p>
</div>`
  areaCard.appendChild(div)
}

enviarCard.addEventListener('click', () => adicionarCard())