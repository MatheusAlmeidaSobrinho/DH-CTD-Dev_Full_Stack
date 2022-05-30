const matheuzin = [42, 69, 52, 70, 80]
const robertin = [42, 60, 52, 88, 80]
let pontosM = 0
let pontosR = 0

for (let pontuacao = 0; pontuacao < matheuzin.length; pontuacao++) {
  if (matheuzin[pontuacao] < robertin[pontuacao]) {
    pontosR++
    console.log(`Robertin venceu essa rodada`)
  } else if (matheuzin[pontuacao] > robertin[pontuacao]) {
    pontosM++
    console.log(`Matheuzin venceu essa rodada`)
  } else {
    console.log(`essa rodada empatou!`)
  }
}

if (pontosR > pontosM) {
  console.log(`O competidor Robertin venceu esse torneio!`)
} else if (pontosR < pontosM) {
  console.log(`O competidor Matheuzin venceu esse torneio!`)
} else {
  console.log(`O torneio terminou empatado!`)
}
