//Desenvolver um script que permita somar um array de números consecutivos, de forma que se some o primeiro número com o segundo e o imprima através do console.
//Depois, temos que pegar este resultado e somar o terceiro número, e assim por diante, até termos terminado de percorrer todo o array

let array = [1, 2, 4, 8]
let soma = 0

for (let i = 0; i < array.length; i++) {
  soma += array[i]
  console.log(soma)
}

console.log('-------------------------------------------------------')

let array2 = [1, 2, 4, 8]
let soma2 = array2[0]

for (let i = 1; i < array2.length; i++) {
  soma2 += array2[i]
  console.log(soma2)
}

console.log('-------------------------------------------------------')

// ctrl k + ctrl c / ctrl k + ctrl u
