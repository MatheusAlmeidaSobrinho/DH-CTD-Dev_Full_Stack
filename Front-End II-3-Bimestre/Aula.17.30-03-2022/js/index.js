let botaoRandom = document.getElementById('random')
let divCard = document.getElementById('card')

function apiComFetch() {
  fetch('https://randomuser.me/api/')
    .then(resposta => {
      return resposta.json()
    })
    .then(resposta2 => {
      return resposta2.results[0]
    })
    .then(resposta3 => {
      return renderizarDadosUsuario(resposta3)
    })

    .catch(error => {
      console.log(error)
    })
}

function renderizarDadosUsuario(dados) {
  botaoRandom.addEventListener('click', function () {
    divCard.innerHTML = `
    <div class="card">
    <div id="imgCard"><img src="${dados.picture.large}"> </img></div>
    <h2>${dados.name.title} ${dados.name.first} ${dados.name.last}</h2>
    <p>Email: ${dados.email}</p>
    <p>Idade: ${dados.dob.age} anos</p><p>Cel: ${dados.phone}</p>
    </div>`
  })
}

botaoRandom.addEventListener('click', function (evento) {
  evento.preventDefault()
  apiComFetch()
})
