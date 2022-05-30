function alterarImagem() {
  let escolhaImg = prompt(
    `A imagem de qual animal você quer mudar?\n 0- Leão\n 1 -Tigre\n 2 -Leopardo\n 3 -Pantera negra\n 4 -Jaguar\n 5 -Guepardo`
  )

  let urlImg = prompt(' digite aqui a sua url: ')

  let imgEscolhida = document.querySelectorAll('img')
  imgEscolhida = imgEscolhida[escolhaImg]

  imgEscolhida.setAttribute('src', urlImg)
}
