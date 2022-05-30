// 1. Crie uma função que converta polegadas em centímetros.
function conversao(a) {
  return a * 2.54
}
console.log('A conversão retorna o valor: ' + conversao(7) + 'cm')

// 2. Crie uma função que receba uma string e a converta em um URL.
function url(b) {
  return 'http://www.' + b + '.com.br'
}
console.log('Minha URL é:' + url('matheusalmeida.js'))

// 3. Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).
function c(nome) {
  return nome + '!'
}
console.log(c('Matheus de Almeida'))

// 4. Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.
function d(dog) {
  return dog * 7
}
console.log('Meu dog tem: ' + d(8) + ' anos na conversão ^^')

// 5. Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
function e(horatrabalhada) {
  return (horatrabalhada * 176).toFixed(2)
}
console.log('Meu salario é: ' + e(10.07) + ' reais por mês.')

// 6. Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. Em seguida, execute a função, testando diferentes valores.
function f(peso, altura) {
  let calculadoraimc = peso / (altura * altura)
  return calculadoraimc.toFixed(3)
}
console.log(
  'Meu IMC é de ' +
    f(100, 1.92) +
    ' estando abaixo do patrão considerado obeso.'
)

// 7. Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne. Investigue o que o método de .toUpperCase() faz.
function g(palavras) {
  return palavras.toUpperCase()
}
console.log('Utilizando toUpperCase fica: ' + g('ce loko cachorreira'))

// 8. Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.
function h(tipo) {
  return typeof tipo
}
console.log('O parametro é do tipo: ' + h('batata'))
console.log('O parametro é do tipo: ' + h(17991626361))

// 9. Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.
function i(raio) {
  let pi = 3.14
  let circunferência = pi * raio
  return circunferência.toFixed(2)
}
console.log('A circunferência tem valor: ' + i(10) + ' milimetros')

// 10. Crie uma função pela qual calculamos a area da circunferência.
function j(diametro, comprimento) {
  let pi = 3.14
  let raio = diametro * comprimento
  let areacirculo = pi * (raio * raio)
  return areacirculo.toFixed(2) // area = pi * raio elevado 2
}
console.log('Area da circunferência é: ' + j(2, 3) + ' milimetros')
