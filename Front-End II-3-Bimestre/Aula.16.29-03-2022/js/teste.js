const baseDeDados = {
  resultado: [
    {
      genero: 'masculino',
      nome: {
        titulo: 'sr',
        primeiro: 'David',
        ultimo: 'Fernando'
      },
      localizacao: {
        rua: ' Augusta , 238',
        cidade: 'São Paulo',
        Estado: 'São Paulo',
        postcode: '01305000',
        coordenadas: {
          latitude: '-23.5569581',
          longitude: '-46.6589677'
        },
        timezone: {
          offset: '-3:00',
          descricao: 'Brasil'
        }
      },
      email: 'david.fernando@exemplo.com',
      login: {
        uuid: '155e77ee-ba6d-486f-95ce-0e0c0fb4b919',
        usuario: 'silverswan131',
        senha: 'firewall',
        salt: 'TQA1Gz7x',
        md5: 'dc523cb313b63dfe5be2140b0c05b3bc',
        sha1: '7a4aa07d1bedcc6bcf4b7f8856643492c191540d',
        sha256:
          '74364e96174afa7d17ee52dd2c9c7a4651fe1254f471a78bda0190135dcd3480'
      },
      dob: {
        data: '1993-07-20T09:44:18.674Z',
        idade: 26
      },
      registro: {
        data: '2002-05-21T10:59:49.966Z',
        idade: 17
      },
      fone: '011-4039-8745',
      celular: '011-99874-5621',
      id: {
        nome: 'PPS',
        valor: '0390511T'
      },
      imagem: {
        grande: 'https://randomuser.me/api/portraits/men/75.jpg',
        media: 'https://randomuser.me/api/portraits/med/men/75.jpg',
        miniatura: 'https://randomuser.me/api/portraits/thumb/men/75.jpg'
      },
      nat: 'IE'
    }
  ],
  info: {
    seed: 'fea8be3e64777240',
    resultado: 1,
    pagina: 1,
    versao: '1.3'
  }
}

let consultandoBaseDeDados = new Promise((resolve, reject) => {
  // Aqui temos uma solicitação simulada para um banco de dados, com um atraso de 2 segundos.
  //A lógica interna estará  no servidor e nós apenas esperaríamos por uma resposta.
  setTimeout(function () {
    if (baseDeDados == null) {
      reject({
        mensagem: 'Base de dados inexistente.'
      })
    } else {
      resolve(baseDeDados)
    }
  }, 2000)
})

// Aqui realizamos uma consulta da promessa, aguardando sua resposta assíncrona
consultandoBaseDeDados
  .then(function (thenEmail) {
    console.log('Acessando Email')
    console.log(thenEmail)
    return thenEmail.resultado[0].email
  })
  .then(function (thenEmail2) {
    console.log('Capturando Email')
    console.log(thenEmail2)
  })

  .catch(error => {
    console.log(error)
  })

consultandoBaseDeDados
  .then(function (thenImagem) {
    console.log('Acessando Imagem')
    console.log(thenImagem)
    return thenImagem.resultado[0].imagem.grande
  })
  .then(function (thenImagem2) {
    console.log('Capturando Imagem')
    console.log(thenImagem2)
  })

  .catch(error => {
    console.log(error)
  })

consultandoBaseDeDados
  .then(function (thenPrimeiroNome) {
    console.log('Acessando Primeiro Nome')
    console.log(thenPrimeiroNome)
    return thenPrimeiroNome.resultado[0].nome.primeiro
  })
  .then(function (thenPrimeiroNome2) {
    console.log('Capturando Primeiro Nome')
    console.log(thenPrimeiroNome2)
  })

  .catch(error => {
    console.log(error)
  })

consultandoBaseDeDados
  .then(function (thenUltimoNome) {
    console.log('Acessando Ultimo Nome')
    console.log(thenUltimoNome)
    return thenUltimoNome.resultado[0].nome.ultimo
  })
  .then(function (thenUltimoNome2) {
    console.log('Capturando Ultimo Nome')
    console.log(thenUltimoNome2)
  })

  .catch(error => {
    console.log(error)
  })

consultandoBaseDeDados.then(function () {
  let campoDados = document.getElementById('tarjeta')
  let div = document.createElement('div')
  div.innerHTML = `    
  <div class="card">        
  <h3>${thenPrimeiroNome2} ${thenUltimoNome2}</h3>
  <p>Email: ${thenEmail2}</p>
  <img src="${thenImagem2}" alt="">`
  campoDados.appendChild(div)
})
