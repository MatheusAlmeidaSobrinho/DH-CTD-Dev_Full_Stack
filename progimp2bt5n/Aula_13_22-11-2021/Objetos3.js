let conta = {
  numeroConta: 0,
  tipoConta: '',
  salConta: 0,
  tirular: ''
}

function Conta(numeroConta, tipoConta, salConta, titular) {
  this.numeroConta = numeroConta
  this.tipoConta = tipoConta
  this.salConta = salConta
  this.titular = titular
}

let numeroConta = [1234, 1346, 1597, 1943, 2543]
let tipoConta = ['Corrente', 'Poupança', 'Corrente', 'Poupança', 'Poupança']
let salConta = [1500, 2000, 2500, 3000, 3500]
let titular = ['ana', 'pedro', 'joao', 'luana', 'matheus']

let lista = []
lista.push(numeroConta, tipoConta, salConta, titular)

for (let i = 0; i < 5; i++) {
  if (numeroConta[i] + tipoConta[i] + salConta[i] + titular[i]) {
    console.log(
      `Cliente ${titular[i]} possui conta tipo ${tipoConta[i]} numeração:${numeroConta[i]} e recebe salario ${salConta[i]} por mês`
    )
  }
}
