// O que esses códigos retornam?
// 1.
let numbers = [22, 33, 54, 66, 72]
console.log([numbers.length])

// 2.
let grupoDeAmigosum = [
  ['Harry', 'Ron', 'Hermione'],
  ['Spiderman', 'Hulk', 'Ironman'],
  ['Penélope Glamour', 'Pierre Nodoyuna', 'Patán']
]
console.log(grupoDeAmigosum[1][0][grupoDeAmigosum[1][0].length - 9])

// 3.
let str = 'una string qualquer'
let str2 = 'batata'
let grupoDeAmigos2 = [
  [45, 89, 0],
  ['Digital', 'House', true],
  ['string', '123', 'false', 54, true, str, str2]
]
console.log(grupoDeAmigos2[2][grupoDeAmigos2[2].length - 1])

// 4. Array Invertido / imprimirInverso
// 1.
let imprimirInverso = [[10, 20, 30]]
console.log(
  imprimirInverso[0][imprimirInverso[0].length - 1],
  imprimirInverso[0][imprimirInverso[0].length - 2],
  imprimirInverso[0][imprimirInverso[0].length - 3]
)

let imprimirInverso1 = [10, 20, 30]
imprimirInverso1.reverse()
console.log(imprimirInverso1)

// 2.
let imprimirInverso2 = [10, 20, 30]
imprimirInverso2.reverse()
imprimirInverso2.reverse()
console.log(imprimirInverso2)

// somarArray
var scfor = [1, 2, 3]
var soma = 0
for (var i = 0; i < scfor.length; i++) {
  soma += scfor[i]
}
console.log(soma)

var scfunction = [10, 3, 10, 4]
var scfunction = scfunction.reduce(function (scfunction, i) {
  return scfunction + i
})
console.log(scfunction)

var scfunction2 = [-5, 100]
var scfunction2 = scfunction2.reduce(function (scfunction2, i) {
  return scfunction2 + i
})
console.log(scfunction2)

// Simulação Array.join()

let simularJoins = ['eu', 'sou', 'um', 'excelente', 'programador']
let separarporvirgula = simularJoins.join(',')
let separarpormenos = simularJoins.join('-')
let juntartodos = simularJoins.join(' ')
console.log(separarporvirgula)
console.log(separarpormenos)
console.log(juntartodos)

// Coleções de Filmes (e mais…)
let filme1 = 'star wars '
let filme2 = 'matrix '
let filme3 = 'mr. robot '
let filme4 = 'preço do amanha '
let filme5 = 'a vida é bela'

let filmes = filme1 + filme2 + filme3 + filme4 + filme5

console.log(`Os filmes ${filmes.toUpperCase()} estão em maiusculo`)
/////////////////////////////////////////////////////////////////////////////////////////////////////////
let filmes2 = [
  'star wars ',
  'matrix ',
  'mr. robot ',
  'preço do amanha ',
  'a vida é bela'
]
for (let i = 0; i < filmes2.length; i++) {
  if (filmes2.length) {
    console.log(`O filme ${filmes2[i].toUpperCase()} está em maiusculo`)
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
let filmes3 = [
  'toy story',
  'finding Nemo',
  'kung-fu panda',
  'wally',
  'fortnite'
]
for (let i = 0; i < filmes3.length; i++) {
  if (filmes3.length) {
    console.log(`O filme ${filmes3[i].toUpperCase()} está em maiusculo`)
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
let juncaoFilmes = []

console.log(juncaoFilmes.push(filmes2 + filmes3))
console.log(juncaoFilmes)
///////////////////////////////////////////////////////////////////////////////////////////////////
console.log(juncaoFilmes.pop())
console.log(juncaoFilmes.length)
