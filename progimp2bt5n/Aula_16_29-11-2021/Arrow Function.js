let fizzBuzz = (x, y) => {
    for (let i = 0; i < 100; i++) {
      if ([i] % x == 0 && [i] % y == 0){
      console.log(`${i} FizzBuzz`);}
      else if ([i] % x == 0) {
      console.log(`${i} Fizz`)}
      else if ([i] % y == 0) {
        console.log(`${i} Buzz`)}
      else {console.log(i)}
   }
}

fizzBuzz(3,5);
/*
let FizzBuzz = (numero1, numero2) => {
  for (let i = 1; i <= 100; i++) {
    if (i % numero1 === 0 && i % numero2 === 0) {
      console.log('FizzBuzz')
    } else if (i % numero1 === 0) {
      console.log('Fizz')
    } else if (i % numero2 === 0) {
      console.log('Buzz')
    } else {
      console.log(i)
    }
  }
}

FizzBuzz(5, 8)

let FizzBuzz = (numero1, numero2) => {
  for (let i = 1; i <= 100; i++) {
    if (i % numero2 === 0) {
      console.log([i] + '= Buzz')
    }
    if (i % numero1 === 0) {
      console.log([i] + '= Fizz')
    }
    if (i % numero1 === 0 && i % numero2 === 0) {
      console.log([i] + '= FizzBuzz')
    } else {
      console.log(i)
    }
  }
}

FizzBuzz(3, 5)


const print = mensagem => console.log(mensagem);

print("Olá, boa noite");

function soma(n1, n2) {
    return n1 + n2;
}

console.log(soma(10, 10));

const somar = (n1, n2) => (n1+n2);

console.log(somar(10, 5));*/