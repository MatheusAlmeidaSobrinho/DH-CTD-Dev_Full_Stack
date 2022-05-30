let conta = {
  numeroConta: 0,
  tipoConta: 'Corrente',
  salConta: 0,
  tirular: ''
}

function Conta(numeroConta, tipoConta, salConta, titular) {
  this.numeroConta = numeroConta
  this.tipoConta = tipoConta
  this.salConta = salConta
  this.titular = titular
}

let conta2 = new Conta(2, 'poupanca', 2000, 'Larissa')
let conta3 = new Conta(3, 'corrente', 3000, 'Ana')
let conta4 = new Conta(4, 'corrente', 8000, 'Paulo')
let lista = []
lista.push(conta2, conta3, conta4)

console.log(lista)
