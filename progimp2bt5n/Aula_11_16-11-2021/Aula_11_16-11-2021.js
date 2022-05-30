let filmes = [
  'star wars',
  'totoro',
  'rocky',
  'pulp fiction',
  'la vida es bella',
  'The Potatos',
  'Galaxy Guardians',
  'Avengers'
]
function nomesMaiusculo(filmes) {
  for (let quantidade = 0; quantidade < filmes.length; quantidade++) {
    filmes[quantidade] = filmes[quantidade].toUpperCase()
  }
  return filmes
}

console.log(nomesMaiusculo(filmes))
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
let filmesA = [
  'star wars',
  'totoro',
  'rocky',
  'pulp fiction',
  'la vida es bella',
  'The Potatos',
  'Galaxy Guardians',
  'Avengers'
]
let filmesB = []

let tamanho = filmesA.length

function passagemElementos() {
  for (let i = 0; i < tamanho; i++) {
    filmesB.push(filmesA.pop())
  }
  return filmesB
}

console.log(passagemElementos())
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
let filmesC = [
  'star wars',
  'totoro',
  'rocky',
  'pulp fiction',
  'la vida es bella',
  'The Potatos',
  'Galaxy Guardians',
  'Avengers'
]
filmesC.pop()
console.log(filmesC)
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4]
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5]

let iguais = 0
let diferentes = 0

for (notas = 0; notas < asiaScores.length; notas++) {
  if (asiaScores[notas] === euroScores[notas]) {
    iguais++
    console.log(`As notas são iguais`)
  } else {
    diferentes++
    console.log(`as notas sao diferentes`)
  }
}
if (iguais > diferentes) {
  console.log('tem mais notas iguais do que diferentes')
} else {
  console.log('tem mais notas diferentes do que iguais')
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
let pA = [5, 8, 4, 9, 5]
let pB = [8, 7, 8, 6, 8]
let pC = [7, 5, 10, 8, 3]

const pAr = (previousValue, currentValue) => previousValue + currentValue
//console.log(pA.reduce(pAr))
const pBr = (previousValue, currentValue) => previousValue + currentValue
//console.log(pB.reduce(pBr))
const pCr = (previousValue, currentValue) => previousValue + currentValue
//console.log(pC.reduce(pCr))

let pAm = pA.reduce(pAr) / pA.length
//console.log(pAm)
let pBm = pB.reduce(pBr) / pB.length
//console.log(pBm)
let pCm = pC.reduce(pCr) / pC.length
//console.log(pCm)

for (let pont = 0; pont < 1; pont++) {
  if (pAm > pBm && pAm > pCm) {
    console.log('Participante A tem a melhor media')
  } else if (pBm > pAm && pBm > pCm) {
    console.log('Participante B tem a melhor media')
  } else if (pCm > pAm && pCm > pBm) {
    console.log('Participante C tem a melhor media')
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
for (let pont = 0; pont < 1; pont++) {
  if (
    pA.reduce(pAr) / pA.length > pB.reduce(pBr) / pB.length &&
    pA.reduce(pAr) / pA.length > pC.reduce(pCr) / pC.length
  ) {
    console.log('Participante A tem a melhor media')
  } else if (
    pB.reduce(pBr) / pB.length > pA.reduce(pAr) / pA.length &&
    pB.reduce(pBr) / pB.length > pC.reduce(pCr) / pC.length
  ) {
    console.log('Participante B tem a melhor media')
  } else if (
    pC.reduce(pCr) / pC.length > pA.reduce(pAr) / pA.length &&
    pC.reduce(pCr) / pC.length > pA.length > pB.reduce(pBr)
  ) {
    console.log('Participante C tem a melhor media')
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
for (let pont = 0; pont < pA.length; pont++) {
  if (pA[pont] > pB[pont] && pA[pont] > pC[pont]) {
    console.log('Participante A tem a melhor nota nesse teste')
  } else if (pB[pont] > pA[pont] && pB[pont] > pC[pont]) {
    console.log('Participante B tem a melhor nota nesse teste')
  } else if (pC[pont] > pA[pont] && pC[pont] > pB[pont]) {
    console.log('Participante C tem a melhor nota nesse teste')
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
console.log('---------------#---------------#---------------#---------------')
//////////////////////////////////////////////////////////////////////////////////////////////////////
for (let pont = 0; pont < 1; pont++) {
  if (pA[2] > pB[2] && pA[2] > pC[2]) {
    console.log('Participante A tem a MAIOR NOTA de todos os testes')
  } else if (pB[2] > pA[2] && pB[2] > pC[2]) {
    console.log('Participante B tem a MAIOR NOTA de todos os testes')
  } else if (pC[2] > pA[2] && pC[2] > pB[2]) {
    console.log('Participante C tem a MAIOR NOTA de todos os testes')
  }
}
