// Loop de Pares
// O QUE É UM LOOP: LAÇO DE REPETIÇÃO

// Você deve criar uma função chamada loopDePares que receba um número como parâmetro 
// e faça loops de 0 a 100 mostrando cada número do loop no console.
// Caso o (número da iteração somado com o número passado pelo parâmetro) seja par (% == 0),
// aparecerá no console: "O número x é par"

function loopDePares(numero) {
  for (let i = 0; i <= 100; i++) {
    if ([i] %  numero == 0 ){
    console.log(`O numero ${i} é par`);}
    else {console.log(i)}
 }
 return loopDePares
}

loopDePares(2)

function criaArray(tamanho) {
  let array = [];
  for (let i = 0; i <= tamanho; i++) {
      array.push(i);
  }
  return array;
}
let entrada = criaArray(100);

let pares = entrada.filter(numero => numero % 2 == 0);
let impares = entrada.filter(numero => numero % 2 != 0); 

console.log(pares)
console.log(impares)


    // ESCOLHER UMA ESTRUTURA DE LAÇO DE REPETIÇÃO --> métodos avançados de array
    // O LOOP PRECISA MOSTRAR OS NÚMEROS DE 0 A 100

    // opções: WHILE, FOR, FOREACH, DO WHILE

    // DENTRO DO LOOP
    // MOSTRAR O NÚMERO - CONTADOR
    // CASO o (contador+numero) % == 0 
        // x = (contador+numero)
        // CASO TRUE - "O número x é par"
        // CASO FALSE - mostra o contador



// loopDePares(5); // chamada da função para TESTAR o resultado

// Lidando com dois arrays
// Você deve criar uma função chamada arrayHandler que receba dois arrays de igual tamanho como
// parâmetros e exiba no console: "Eu sou {elemento do array 1} e eu sou {elemento do array 2}".
// Exemplo:
// arrayHandler([1,2,3], [“o”,”l”,”á”]) deve mostrar: 
// Eu sou 1 e eu sou o
// Eu sou 2 e eu sou l
// Eu sou 3 e eu sou á

function arrayHandler(array1,array2) {

  if (array1.length == array2.length){
  let tamanho = array1.length;
  for (let i = 0; i < tamanho; i++) {
    console.log(`i'm [${array1[i]}] and i'm [${array2[i].toUpperCase()}]`) 
  }
  } else {console.log('Arrays são de tamanhos diferentes')}
  }


arrayHandler([1,2,3],['o','l','a'])
arrayHandler([1,2,3,4],['o','l','a'])
    // TESTAR se os tamanhos dos arrays são iguais
    // CASO true
    // FAZ AÇÃO DA FUNÇÃO

    // ESTRUTURA DE REPETIÇÃO QUE CONSIGA PASSAR POR TODO ARRAY - método avançado
    // em cada posição, mostra na tela "Eu sou array1[contador] e eu sou array2[contador]"

    // CASO false
    // mostrar na tela que tamanho é diferente e não faz a ação da função


// arrayHandler([1, 2, 3], ["o", "l", "á"]);

/* arrayHandler([1, 2, 3, 4], ["o", "l", "á"]); // tamanho de parâmetros é diferente */ 