// tentativa numero 7, tentando desenvolver com switch

let opcoesMicroondas = 'carne'
let tempoEmSeg = 20

let text = 'Seu Prato está pronto!!!'

switch (opcoesMicroondas) {
  case 'pipoca':
    switch (opcoesMicroondas) {
      case tempoEmSeg < 10:
        console.log('tempo insuficiente. ' + text)
        break
      case tempoEmSeg >= 10 && tempoEmSeg < 20:
        console.log('Prato pronto, bom apetite. ' + text)
        break
      case tempoEmSeg >= 20 && tempoEmSeg < 30:
        console.log('a comida queimou. ' + text)
        break
      case tempoEmSeg >= 30:
        console.log('KABUM. ' + text)
        break
      default:
        console.log('Prato inexistente')
        break
    }
    break
  case 'macarrao':
  case 'brigadeiro':
    switch (opcoesMicroondas) {
      case tempoEmSeg < 8:
        console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 8 && tempoEmSeg < 16:
        console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 16 && tempoEmSeg < 24:
        console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 24:
        console.log('KABUM. ' + 'Seu Prato está pronto!!!')
        break
      default:
        console.log('Prato inexistente')
        break
    }
    break
  case 'carne':
    switch (opcoesMicroondas) {
      case tempoEmSeg < 15:
        console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 15 && tempoEmSeg < 30:
        console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 30 && tempoEmSeg < 45:
        console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 45:
        console.log('KABUM. ' + 'Seu Prato está pronto!!!')
        break
      default:
        console.log('Prato inexistente')
        break
    }
    break
  case 'feijao':
    switch (opcoesMicroondas) {
      case tempoEmSeg < 12:
        console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 12 && tempoEmSeg < 24:
        console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 24 && tempoEmSeg < 36:
        console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
        break
      case tempoEmSeg >= 36:
        console.log('KABUM. ' + 'Seu Prato está pronto!!!')
        break
      default:
        console.log('Prato inexistente')
        break
    }
    break
}

// obs: nao funciona nao sei oque esta faltando ou sobrando, acredito que falta definir mais itens.
// tentativas 4 5 deram o resultado da tentativa 6, no checkpoint vou implementar if else dentro
// obs: tentar colocar numa function para usar return.
