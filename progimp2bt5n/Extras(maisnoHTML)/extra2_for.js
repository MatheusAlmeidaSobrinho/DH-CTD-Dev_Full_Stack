//////////////////////////////////////////////////////////////////////////////////////////////////
// FOR ====== PARA variavel tal x = valortal
for (let i = 1; i < 6; i++) {
  console.log(`Volta numero: ${i}`)
}

for (let palavra = 1; palavra < 6; palavra++) {
  console.log('Ola Mundo')
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//  (inicio cont; lim max rep; modificardor cont)
for (let numImpar = 1; numImpar <= 10; numImpar++) {
  if (numImpar % 2 != 0) console.log(`De 0 a 10 os impares são:${numImpar}`)
}

for (let numPar = 1; numPar <= 10; numPar++) {
  if (numPar % 2 == 0) console.log(`De 0 a 10 os pares são:${numPar}`)
}
//////////////////////////////////////////////////////////////////////////////////////////////////
// NÃO UTILIZEI DOIS LOOPS FOR.
let numCinco = 5
for (let multiplicador = 1; multiplicador <= 10; multiplicador++) {
  console.log(`tabuada do 5 é: 5x${multiplicador}= ${numCinco * multiplicador}`)
}

let numNove = 9
for (let multiplicador = 1; multiplicador <= 10; multiplicador++) {
  console.log(
    `tabuada do ${numNove} é: ${numNove}x${multiplicador}= ${
      numNove * multiplicador
    }`
  )
}
//////////////////////////////////////////////////////////////////////////////////////////////////
// WHILE E DO WHILE ====== ENQUANTO e FAÇA ENQUANTO

let testevolta1 = 1
while (testevolta1 <= 5) {
  console.log(`Volta nº: ${testevolta1}`)
  testevolta1++
}

let testevolta2 = 1
do {
  console.log(`Volta nº: ${testevolta2}`)
  testevolta2++
} while (testevolta2 <= 5)
//(diferença é: no while ele verifica tudo no DO WHILE ele nao verifica a 1 iteração no caso a volta 1)
//////////////////////////////////////////////////////////////////////////////////////////////////

// 1. Escreva um aplicativo em Javascript que mostre todos os números ímpares de 1 até 100

let numerosImpares = 1
while (numerosImpares <= 100) {
  if (numerosImpares % 2 != 0)
    console.log(`De 0 a 100 os impares são:${numerosImpares}`)
  numerosImpares++
}

// 2. Escreva um aplicativo em Javascript que mostre todos os números pares de 1 até 100.

let numerosPares = 0
while (numerosPares <= 100) {
  if (numerosPares % 2 == 0)
    console.log(`De 0 a 100 os pares são:${numerosPares}`)
  numerosPares++
}

let numerosInteiros = 1
while (numerosInteiros <= 100) {
  if (numerosInteiros % 2 != 0)
    console.log(`De 0 a 100 os impares são:${numerosInteiros}`)
  else if (numerosInteiros % 2 == 0)
    console.log(`De 0 a 100 os pares são:${numerosInteiros}`)
  numerosInteiros++
}

// 4. Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
// Em seguida, através de um laço while, pede ao usuário para que entre com as notas
// de todos os alunos da sala, um por vez. Por fim, o programa mostra a média aritmética da turma.
