alert('Bem Vindo ao jogo Pedra,Papel,Tesoura!!!')

let pontosJogador = 0
let pontosiA = 0
let melhorDeTres = true // se true então percorrer ate atingir a condição de 3 partidas.

// enquanto tiver a partida, o jogador seleciona 1 2 ou 3 e o bot fica randomico
// parseInt para ambos pra converter o valor em numerico e nao string
while (melhorDeTres) {
  let jogador = prompt('Escolha:\n1-Pedra \n2-Papel \n3-Tesoura')
  jogador = parseInt(jogador)

  let iA = parseInt(Math.random() * 3 + 1)
  alert(`O bot escolheu: ${iA}`)

  if (jogador == iA) {
    jogador = 0
  }

  switch (jogador) {
    case 0:
      alert('Houve empate!')
      break

    case 1:
      if (iA == 3) {
        alert(
          'Você escolheu PEDRA, o bot escolheu TESOURA. Você GANHOU esta rodada !!!'
        )
        pontosJogador++
      } else {
        alert(
          'Você escolheu PEDRA, o bot escolheu PAPEL. Você PERDEU esta rodada !!!'
        )
        pontosiA++
      }
      break

    case 2:
      if (iA == 1) {
        alert(
          'Você escolheu PAPEL, o bot escolheu PEDRA. Você GANHOU esta rodada !!!'
        )
        pontosJogador++
      } else {
        alert(
          'Você escolheu PAPEL, o bot escolheu TESOURA. Você PERDEU esta rodada !!!'
        )
        pontosiA++
      }
      break

    case 3:
      if (iA == 2) {
        alert(
          'Você escolheu TESOURA, o bot escolheu PAPEL. Você GANHOU esta rodada !!!'
        )
        pontosJogador++
      } else {
        alert(
          'Você escolheu TESOURA, o bot escolheu PEDRA. Você PERDEU esta rodada !!!'
        )
        pontosiA++
      }
      break

    default:
      alert('')
  }

  if (pontosJogador == 2) {
    alert(
      `Parabens Você ganhou!!! \n Placar: 
      \n Jogador: ${pontosJogador} 
      \n iA: ${pontosiA}`
    )

    melhorDeTres = false
  } else if (pontosiA == 2) {
    alert(
      `Infelizmente você perdeu!!! \n Placar: 
        \n Jogador: ${pontosJogador} 
        \n iA: ${pontosiA}`
    )
    melhorDeTres = false
  }
}
