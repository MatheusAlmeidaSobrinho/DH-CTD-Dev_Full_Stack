let numPares = [2,4,6,8,10]
let numImpares = numPares.map(function (num){ return num - 1})
console.log(numImpares)

let nomes = ['Maria', 'Pedro', 'Joao', 'Maria']
let nomesMaria = nomes.filter(function (filterMaria) {return filterMaria == 'Maria'})
console.log(nomesMaria)

let numA = [1,9,9,6,0,3,0,4]
let numB = numA.reduce(function (numR) {return numR = numA.join('-')})
console.log(numB)

let animais = ['Aguia', 'Boto', 'Carcaju', 'Dromedario', 'Elefante']
  animais.forEach(function (textoMaisVar) 
  {console.log(`Nome do Animal é: ${textoMaisVar}`)})

// let animais = ['Aguia', 'Boto', 'Carcaju', 'Dromedario', 'Elefante']
// let nomeAnimais = animais.forEach(function (textoMaisVar) 
// {return textoMaisVar = console.log(`Nome do Animal é: ${animais}`)})


