let nome = 'Matheus'
let idade = '26'
let profissao = 'Programador'

console.log(
  `O aluno ${nome} com idade de ${idade} se formou e agora é um ${profissao}`
)

let salario = 1402.58
//forma 1
console.log(`Meu salario é de ${salario} reais por mes`)

//forma 2
console.log(`Meu salario é de ${salario.toFixed} reais por mes`)

//forma 3
console.log(
  `Meu salario é de ${salario.toFixed(2).replace('.', ',')} reais por mes`
)
console.log(
  `Meu salario é de ${salario.toLocaleString('pt-BR', {
    style: 'currency',
    currency: 'BRL'
  })} reais por mes`
)
