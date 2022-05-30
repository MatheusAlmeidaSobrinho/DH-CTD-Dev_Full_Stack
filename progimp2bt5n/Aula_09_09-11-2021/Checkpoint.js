// Oi professora =D corrige com carinho *-*
function microondas(opcoes, tempoEmSeg) {
  let textoFinal = 'Seu Prato está pronto!!!'
  switch (opcoes) {
    case 'pipoca':
      if (tempoEmSeg < 10) {
        return console.log('tempo insuficiente. ')
      } else if (tempoEmSeg >= 10 && tempoEmSeg < 20) {
        return console.log('Prato pronto, bom apetite. ' + textoFinal)
      } else if (tempoEmSeg >= 20 && tempoEmSeg < 30) {
        return console.log('a comida queimou. ')
      } else if (tempoEmSeg >= 30) {
        return console.log('KABUM. ')
      }
      break

    case 'macarrao':
    case 'brigadeiro':
      if (tempoEmSeg < 8) {
        return console.log('tempo insuficiente. ')
      } else if (tempoEmSeg >= 8 && tempoEmSeg < 16) {
        return console.log('Prato pronto, bom apetite. ' + textoFinal)
      } else if (tempoEmSeg >= 16 && tempoEmSeg < 24) {
        return console.log('a comida queimou. ')
      } else if (tempoEmSeg >= 24) {
        return console.log('KABUM. ')
      }
      break

    case 'carne':
      if (tempoEmSeg < 15) {
        return console.log('tempo insuficiente. ')
      } else if (tempoEmSeg >= 15 && tempoEmSeg < 30) {
        return console.log('Prato pronto, bom apetite. ' + textoFinal)
      } else if (tempoEmSeg >= 30 && tempoEmSeg < 45) {
        return console.log('a comida queimou. ')
      } else if (tempoEmSeg >= 45) {
        return console.log('KABUM. ')
      }
      break

    case 'feijao':
      if (tempoEmSeg < 12) {
        return console.log('tempo insuficiente. ')
      } else if (tempoEmSeg >= 12 && tempoEmSeg < 24) {
        return console.log('Prato pronto, bom apetite. ' + textoFinal)
      } else if (tempoEmSeg >= 24 && tempoEmSeg < 36) {
        return console.log('a comida queimou. ')
      } else if (tempoEmSeg >= 36) {
        return console.log('KABUM. ')
      }
      break

    default:
      return console.log('Prato inexistente')
  }
}

// 5 EXEMPLOS UTILIZANDO TODOS OS POSSIVEIS RETORNOS (PARA SE DIVERTIR =D)
microondas('pipoca', 8)
microondas('macarrao', 14)
microondas('carne', 32)
microondas('feijao', 38)
microondas('strogonof', 40)

// É possivel reduzir ainda mais o codigo porem sinto que está facil de entender.
// Nesse exemplo final utilizando o switch fiz a junção do macarrao e brigadeiro pelo fator de tempos identicos oque facilitou e simplificou o codigo dos testes anteriores.
// Ainda teria como criar textos pre-definidos (assim como o textoFinal) para as repetições das opções de resposta nas comidas e tambem quebrar a linha pro textoFinal aparecer em baixo.
// tambem teria como fazer o textoFinal nao ser repetido em todos os return's ( não sei como ainda!)
// tambem teria como definir variaveis dentro da função sem precisar de return no console para mostrar o resultado desejado, mais dai so teria um retorno ( porem acredito que na junção com um site seria o ideal)
// nas tentativas passadas encontrei outras 3 formas de fazer (corretamente), uma usando somente if else, outra em funções separadas e juntando em uma e fazendo usando só com switch (essa nao consegui fazer funcionar muito bem) porem esse modelo final foi oque eu achei mais ideal para esse contexto solicitado.
// tambem poderiamos colocar uma condição no default para quando for preenchido com strings caracteres ou tempos negativos ele retornar uma frase simples de Tempo inexistente.
// obs: else  tem a função parecida com a do break (eles se cancelam)
// a forma de retorno com o console poderia ser feita de diversas maneiras, mais para esse contexto resolvi adotar o metodo microondas > comida > tempo , por me parecer mais logico.
