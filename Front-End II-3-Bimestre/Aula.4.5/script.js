//const template = `<h1>Olá Mundo</h1>`

//const body = document.getElementById('body')
//body.innerText = template // esse aqui coloca tudo oque ta entre as aspas
//body.innerHTML = template // esse aqui reconhece o h1 e coloca so oque tem dentro dele

//let nome = prompt('Informe seu nome abaixo:')
//let sobrenome = prompt('Informe seu sobrenome abaixo:')

//const nomeComp = `${nome} ${sobrenome}`

//let nomeCompleto = document.getElementById('nomeCompleto')
//nomeCompleto.innerText = `Nome: ${nomeComp}`

let personagem = {
  nome: 'Michael',
  sobrenome: 'Scott',
  nascimento: {
    data: '15/04/1965',
    cidade: 'Scranton',
    estado: 'Pensilvânia'
  }
}

let michael = document.getElementById('michaelPotato')
michael.innerText = `Nome: ${personagem.nome} ${personagem.sobrenome}\n 
Nasceu no dia ${personagem.nascimento.data}, na cidade de ${personagem.nascimento.cidade}`
