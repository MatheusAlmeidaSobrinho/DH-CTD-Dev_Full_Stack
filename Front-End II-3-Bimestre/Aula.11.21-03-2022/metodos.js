let nome = document.getElementById('inputNome')
let sobrenome = document.getElementById('inputSobrenome')
let enviar = document.getElementById('buttonEnviar')
let divMetodos = document.getElementById('metodos')

enviar.addEventListener('click', evento => evento.preventDefault)

function adicionarMetodos() {
  let div = document.createElement('div')
  div.innerHTML = `<div class= "inserindoMetodos">
    <h2>Metodo trim()</h2>
    <p>${nome.value.trim()}${sobrenome.value.trim()}</p>

    <h2>Metodo toUpperCase()</h2>
    <p>${nome.value.toUpperCase()}${sobrenome.value.toUpperCase()}</p>

    <h2>Metodo toLowerCase()</h2>
    <p>${nome.value.toLowerCase()}${sobrenome.value.toLowerCase()}</p>

    <h2>Metodo concat()</h2>
    <p>${nome.value.concat(sobrenome.value)}</p>

    <h2>Metodo replace()</h2>
    <p>${nome.value.replace('a', '@')}
       ${sobrenome.value.replace('a', '@')}
    </p>
  </div>`
  divMetodos.appendChild(div)
}

enviar.addEventListener('click', () => adicionarMetodos())
