// criando 5 funções uma para cada tipo de comida.
function pipoca(button_1) {
  if (button_1 < 10) {
    console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
  } else if (button_1 >= 10 && button_1 < 20) {
    console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
  } else if (button_1 >= 20 && button_1 < 30) {
    console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
  } else if (button_1 >= 30) {
    console.log('KABUM. ' + 'Seu Prato está pronto!!!')
  } else {
    console.log('Prato inexistente')
  }
  return pipoca
}

function macarrao(button_2) {
  if (button_2 < 8) {
    console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
  } else if (button_2 >= 8 && button_2 < 16) {
    console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
  } else if (button_2 >= 16 && button_2 < 24) {
    console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
  } else if (button_2 >= 24) {
    console.log('KABUM. ' + 'Seu Prato está pronto!!!')
  } else {
    console.log('Prato inexistente')
  }
  return macarrao
}

function carne(button_3) {
  if (button_3 < 15) {
    console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
  } else if (button_3 >= 15 && button_3 < 30) {
    console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
  } else if (button_3 >= 30 && button_3 < 45) {
    console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
  } else if (button_3 >= 45) {
    console.log('KABUM. ' + 'Seu Prato está pronto!!!')
  } else {
    console.log('Prato inexistente')
  }
  return carne
}

function feijao(button_4) {
  if (button_4 < 12) {
    console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
  } else if (button_4 >= 12 && button_4 < 24) {
    console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
  } else if (button_4 >= 24 && button_4 < 36) {
    console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
  } else if (button_4 >= 36) {
    console.log('KABUM. ' + 'Seu Prato está pronto!!!')
  } else {
    console.log('Prato inexistente')
  }
  return feijao
}

function brigadeiro(button_5) {
  if (button_5 < 8) {
    console.log('tempo insuficiente. ' + 'Seu Prato está pronto!!!')
  } else if (button_5 >= 8 && button_5 < 16) {
    console.log('Prato pronto, bom apetite. ' + 'Seu Prato está pronto!!!')
  } else if (button_5 >= 16 && button_5 < 24) {
    console.log('a comida queimou. ' + 'Seu Prato está pronto!!!')
  } else if (button_5 >= 24) {
    console.log('KABUM. ' + 'Seu Prato está pronto!!!')
  } else {
    console.log('Prato inexistente')
  }
  return brigadeiro
}

// 5 exemplos utilizando todas as possiveis respostas
pipoca(8)
macarrao(14)
carne(32)
feijao(38)
brigadeiro('batata')

// obs nas tentativas anteriores deram muitos erros.
