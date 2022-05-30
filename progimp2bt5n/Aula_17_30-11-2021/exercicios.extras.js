/*  Crie uma função que receba um array composto por números e retorna uma nova
matriz (array) com todos os valores divididos pela soma de toda a matriz, usando
map() e reduce().*/

let numeros = [5, 10, 15, 20, 50];
let soma = numeros.reduce(function(a, b){ return a + b})
console.log(soma) // 28

let dividir = numeros.map(function(){return soma / numeros.length;});
console.log(dividir[1]); // [4,8,12]
/* Crie uma função que receba um array de palavras e um número, e que retorna uma
matriz (array) com apenas as palavras que têm mais do que uma quantidade de
letras maior do que o número informado. (verifique como funciona o método filter ())
*/


/* Crie um array de objetos literais, onde cada objeto será um aluno e terá dois
atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os
alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa.
*/
let nomes = ['A', 'B', 'C', 'D', 'E']
let nota = [8, 9, 5, 6, 10];

for (let i = 0; i < nomes.length; i++){
  if (nota[i] > 7)
  {console.log(`Aluno ${nomes[i]} passou`)}
  else {console.log('reprovou')}
}
