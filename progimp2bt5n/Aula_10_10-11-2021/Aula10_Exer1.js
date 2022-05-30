// Crie um array que contenha nomes de produtos para compra.
// Após isso, exiba no console os resultados das funções relacionadas aos arrays, que são: Join, Pop, Push, Shift e Unshift.
// Também se deve escrever com suas palavras, o que cada função realiza. Seguem abaixo alguns exemplos.

let metodoJoin = ['banana', 'maça', 'mamão', 'laranja', 'limão']
console.log(metodoJoin.join('-'))
// Os valores da matriz, separados pelo separador especificado.
console.log(
  '-----------------------------------1--------------------------------'
)
let metodoPop = ['banana', 'maça', 'mamão', 'laranja', 'limão']
console.log(metodoPop.pop())
console.log(metodoPop)
// remove o ultimo parametro
console.log(
  '-------------------------------------2-----------------------------'
)
let metodoPush = ['banana', 'maça', 'mamão', 'laranja', 'limão']
let metodoPush2 = [1, 2, 3, 4, 5]
console.log(metodoPush.push(metodoPush2))
console.log(metodoPush)
// adiciona um parametro no final // tambem adiciona outra variavel na anterior como um novo parametro
console.log('----------------------------3--------------------------------')
let metodoShift = ['banana', 'maça', 'mamão', 'laranja', 'limão']
let metodoShit2 = [1, 2, 3, 4, 5]
console.log(metodoShift.shift(metodoShit2))
console.log(metodoShift)
//  remove o primeiro parametro
console.log('-----------------------------4-------------------------------')
let metodoUnshift = ['banana', 'maça', 'mamão', 'laranja', 'limão']
let metodoUnshift2 = [1, 2, 3, 4, 5]
console.log(metodoUnshift.unshift(metodoUnshift2))
console.log(metodoUnshift)
// adiciona um parametro no inicio
console.log('-----------------------------5-------------------------------')
let metodoLength = ['banana', 'maça', 'mamão', 'laranja', 'limão']
console.log(metodoLength.length)
// conta quantos parametros tem
console.log('-----------------------------6-------------------------------')
