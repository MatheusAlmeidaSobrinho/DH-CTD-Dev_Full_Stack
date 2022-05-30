const nome = 'Aline'
const sobrenome = 'Ferreira'
const nomecompleto = nome + ' ' + sobrenome
let idade = 33
let peso = 63.7
let altura = 1.53
let plano = false
let imc = peso / (altura * altura)

console.log(
  'Usuario(a) ' +
    nomecompleto +
    ' tem ' +
    idade +
    ' anos e seu índice de massa corporal é de ' +
    imc
)
