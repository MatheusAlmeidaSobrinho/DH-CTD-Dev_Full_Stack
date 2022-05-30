// Parte 1 1.Crie um arquivo calculadora.js que terá as diferentes operações  para realizar.

// 2.Crie uma função adicionar, que deverá receber dois parâmetros e retornar a soma deles.
function adicionar(valorA, valorB) {
  let somar = valorA + valorB
  return somar
}
console.log('Soma dos numeros 5 e 7 é: ' + adicionar(5, 7))

// 3.Crie uma função de subtração, que deverá receber dois parâmetros e retornar a subtração do primeiro menos o segundo.
function subtrair(valorA, valorB) {
  let reduzir = valorA - valorB
  return reduzir
}
console.log('Subtração dos numeros 5 e 7 é: ' + subtrair(5, 7))

// 4.Crie uma função de multiplicação, que deverá receber dois parâmetros e retornar o resultado de sua multiplicação.
function multiplicar(valorA, valorB) {
  let vezes = valorA * valorB
  return vezes
}
console.log('Multiplicação dos numeros 5 por 7 é: ' + multiplicar(5, 7))

// 5.Crie uma função de divisão, que receberá dois parâmetros e retornará o resultado da divisão do primeiro sobre o segundo.
function dividir(valorA, valorB) {
  let divisao = valorA / valorB
  return divisao.toFixed(2)
}
console.log('Divisão dos numeros 5 por 7 é: ' + dividir(5, 7))

// Parte 2. 1.No seu arquivo calculadora.js,  a partir das 4 funções feitas anteriormente, crie um console.log no qual você irá colocar uma string para indicar que abaixo dela você começará a testar as funções, por exemplo:
console.log()
console.log(
  '---------------------------- Teste de Operações / Calculadora ----------------------------'
)

// 2.Execute a função que soma e a função que subtrai, passando quaisquer dois números como argumentos. Mostrar resultados no console.
console.log(
  'Resultado da adição dos numeros 2 e 4 é: ' +
    adicionar(2, 4) +
    ' / Resultado da subtração dos numeros 2 e 4 é: ' +
    subtrair(2, 4)
)

console.log(
  '------------------------------------------------------------------------------------'
)
// 3.Execute a função que multiplica, passando quaisquer dois números como argumentos. Mostre o resultado no console.
console.log(
  'Resultado da multiplicação dos numeros 2 por 4 é: ' + multiplicar(2, 4)
)

console.log(
  '------------------------------------------------------------------------------------'
)
// 4.Execute a função que faz divisão, passando quaisquer dois números como argumentos. Mostre o resultado no console.
console.log('Resultado da divisão dos numeros 2 por 4 é: ' + dividir(2, 4))

console.log(
  '------------------------------------------------------------------------------------'
)

// 5.Execute a função que faz divisão, passando agora o número zero como um dos dois argumentos. Mostre o resultado no console.
console.log('Resultado da divisão de 4 e 0 é: ' + dividir(4, 0))
console.log('Resultado da divisão de a e 0 é: ' + dividir('a', 0))
console.log(
  '------------------------------------------------------------------------------------'
)
// Parte 3 1.Crie uma função chamada quadradoDoNumero, que recebe um número como parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja, ao quadrado.
function quadradoDoNumero(ValorA) {
  let quadradonum = multiplicar(ValorA, ValorA)
  return quadradonum
}
console.log('Retorno de 4² ou 4 elevado a 2 é: ' + quadradoDoNumero(4))
console.log(
  '------------------------------------------------------------------------------------'
)

// 2.Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números, que serão inseridos por parâmetro.
function mediaDeTresNumeros(Valor1, Valor2, Valor3) {
  let media = dividir(adicionar(Valor1, adicionar(Valor2, Valor3)), 3)
  return dividir(adicionar(Valor1, adicionar(Valor2, Valor3)), 3)
}
console.log(
  'O resultado da media dos numeros 3, 15 e 44 é: ' +
    mediaDeTresNumeros(3, 15, 44)
)
console.log(
  '------------------------------------------------------------------------------------'
)
// 3.Crie a função calculaPorcentagem, que receberá dois parâmetros: o número total e a porcentagem que deseja calcular, e que deverá retornar x% de totalPorcentagem.

function calculaPorcentagem(number, percentage) {
  let calcPorcent = multiplicar(number, dividir(percentage, 100))
  return calcPorcent
}
console.log('10% do numero 1250 é: ' + calculaPorcentagem(1250, 10))
console.log(
  '------------------------------------------------------------------------------------'
)
// 4.Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá retornar a porcentagem do primeiro em relação ao segundo parâmetro.
function geradorDePorcentagem(numT, numP) {
  let calcPorcent = dividir(multiplicar(numP, 100), numT)
  return (calcPorcent = dividir(multiplicar(numP, 100), numT))
}
console.log(
  '125 representa ' + geradorDePorcentagem(1250, 125) + '% do numero 1250'
)

console.log(
  '------------------------------------------------------------------------------------'
)
