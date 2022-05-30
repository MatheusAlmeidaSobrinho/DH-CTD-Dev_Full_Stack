window.addEventListener('load', () => {

// VALIDAÇÃO TODOS OS CAMPOS

//Capturando os campos do formulário
var campoNomeCadastro = document.getElementById('inNome')
var campoSobrenomeCadastro = document.getElementById('inSobrenome')
var campoEmailCadastro = document.getElementById('inEmail')
var botaoCriarConta = document.getElementById('btSignup')
// var senha = document.getElementById('senha') LA EMBAIXO
// var conferirSenha = document.getElementById('conferirSenha') LA EMBAIXO

// Normalizando campos do formulario
let campoNomeCadastroNormalizado
let campoSobrenomeCadastroNormalizado
let campoEmailCadastroNormalizado
let campoSenhaCadastroNormalizado
let campoRepetirSenhaCadastroNormalizado

// Criando variaveis definindo como false de inicio para validar
let nomeCadastroEValido = false
let sobrenomeCadastroEValido = false
let emailCadastroEValido = false
let senhaMinCadastroEvalido = false
let senhaMaiCadastroEvalido = false
let senhaNumCadastroEvalido = false
let senhaTamCadastroEvalido = false
let repetirSenhaCadastroEValido = false


//Desabilita o botão ao iniciar a página
botaoCriarConta.setAttribute('disabled', true)
botaoCriarConta.style.background = 'gray'

//Cria o objeto que representa o cadastro do usuário
const criacaoUsuario = {
  firstName: '',
  lastName: '',
  email: '',
  password: ''
}

//Executa ao clicar no botão de Cadastrar
botaoCriarConta.addEventListener('click', function (evento) {
  //Se a validação passar, se for true o retorno da função....
  if (validacaoTelaCadastro()) {
    evento.preventDefault();
    campoNomeCadastroNormalizado = retiraEspacosDeUmValorInformado(campoNomeCadastro.value);
    campoSobrenomeCadastroNormalizado = retiraEspacosDeUmValorInformado(campoSobrenomeCadastro.value);
    campoEmailCadastroNormalizado = retiraEspacosDeUmValorInformado(campoEmailCadastro.value);
    campoEmailCadastroNormalizado = converteValorRecebidoEmMinusculo(campoEmailCadastro.value);

    //Atribui as variáveis normalizadas ao objeto do login
    criacaoUsuario.firstName = campoNomeCadastroNormalizado
    criacaoUsuario.lastName = campoSobrenomeCadastroNormalizado
    criacaoUsuario.email = campoEmailCadastroNormalizado
    criacaoUsuario.password = campoSenhaCadastro.value

    let cadastroUserJson = JSON.stringify(criacaoUsuario);
    cadastro(cadastroUserJson);
    //Se a validação NÃO passar, se for false o retorno da função....
  } else {
    evento.preventDefault()
    alert('Todas as informações devem ser preenchidas')
  }
})

function cadastro(cadastroUserJson) {
      //Funcao do Spinner
      setTimeout(spinner.showSpinner(), 1000);
      //Executar o acesso a API com o login
      let urlEndPointCadastro = "https://ctd-todo-api.herokuapp.com/v1/users";
      let configDaRequisicao = {
        method: 'POST',
        headers: {
          'content-type': 'application/json'
        },
        body: cadastroUserJson
      }
  
      fetch(urlEndPointCadastro, configDaRequisicao)
      .then(
          resultado => {
            if (resultado.status == 201) {
              spinner.removeSpinner();
              return resultado.json();

          } throw resultado;
      }).then(
          resultado => {
            console.log(resultado.jwt);
            localStorage.setItem("jwt", resultado.jwt);
            location.href = "index.html";
      }).catch(
          erro => {
          console.log(erro);
      });
}

//Ao clicar e interagir com campo NOME do cadastro
campoNomeCadastro.addEventListener('blur', function () {
  //Capturando o elemento <Small> do html
  var nomeValidacaoCadastro = document.getElementById('nomeValidacaoCadastro')

  if (campoNomeCadastro.value != '') {
    //Nome tem informação
    nomeValidacaoCadastro.innerText = ''
    campoNomeCadastro.style.border = ``
    nomeCadastroEValido = true
  } else {
    //Nome está vazio
    nomeValidacaoCadastro.innerText = 'Campo obrigatório'
    nomeValidacaoCadastro.style.color = 'rgba(255, 0, 0, 0.75)'
    nomeValidacaoCadastro.style.fontSize = '8'
    nomeValidacaoCadastro.style.fontWeight = 'bold'
    campoNomeCadastro.style.border = `1px solid rgba(255, 0, 0, 0.75)`
    nomeCadastroEValido = false
  }
  validacaoTelaCadastro()
})

//Ao clicar e interagir com campo Sobrenome do cadastro
campoSobrenomeCadastro.addEventListener('blur', function () {
  //Capturando o elemento <Small> do html
  var sobrenomeValidacaoCadastro = document.getElementById(
    'sobrenomeValidacaoCadastro'
  )

  if (campoSobrenomeCadastro.value != '') {
    //Sobrenome tem informação
    sobrenomeValidacaoCadastro.innerText = ''
    campoSobrenomeCadastro.style.border = ``
    sobrenomeCadastroEValido = true
  } else {
    //Sobrenome está vazio
    sobrenomeValidacaoCadastro.innerText = 'Campo obrigatório'
    sobrenomeValidacaoCadastro.style.color = 'rgba(255, 0, 0, 0.75)'
    sobrenomeValidacaoCadastro.style.fontSize = '8'
    sobrenomeValidacaoCadastro.style.fontWeight = 'bold'
    campoSobrenomeCadastro.style.border = `1px solid rgba(255, 0, 0, 0.75)`
    sobrenomeCadastroEValido = false
  }
  validacaoTelaCadastro()
})

//Ao clicar e interagir com campo EMAIL do cadastro
campoEmailCadastro.addEventListener('blur', function () {
  //Capturando o elemento <Small> do html
  var emailValidacaoCadastro = document.getElementById('emailValidacaoCadastro')

  if (campoEmailCadastro.value != '') {
    //Email tem informação
    emailValidacaoCadastro.innerText = ''
    campoEmailCadastro.style.border = ``
    emailCadastroEValido = true
  } else {
    //Email está vazio
    emailValidacaoCadastro.innerText = 'Campo obrigatório'
    emailValidacaoCadastro.style.color = 'rgba(255, 0, 0, 0.75)'
    emailValidacaoCadastro.style.fontSize = '8'
    emailValidacaoCadastro.style.fontWeight = 'bold'
    campoEmailCadastro.style.border = `1px solid rgba(255, 0, 0, 0.75)`
    emailCadastroEValido = false
  }
  validacaoTelaCadastro()
})

campoEmailCadastro.addEventListener('blur', function () {
  //Capturando o elemento <Small> do html
  var emailValidacaoCadastro = document.getElementById('emailValidacaoCadastro')

  if (campoEmailCadastro.value != '') {
    //Email tem informação
    emailValidacaoCadastro.innerText = ''
    campoEmailCadastro.style.border = ``
    emailCadastroEValido = true
  } else {
    //Email está vazio
    emailValidacaoCadastro.innerText = 'Campo obrigatório'
    emailValidacaoCadastro.style.color = 'rgba(255, 0, 0, 0.75)'
    emailValidacaoCadastro.style.fontSize = '8'
    emailValidacaoCadastro.style.fontWeight = 'bold'
    campoEmailCadastro.style.border = `1px solid rgba(255, 0, 0, 0.75)`
    emailCadastroEValido = false
  }
  validacaoTelaCadastro()
})

/////////////////////////////////////////////////////////////////////////////////////////////////////////

// VALIDAÇÃO SENHA

var campoSenhaCadastro = document.getElementById('senha')
var letraMin = document.getElementById('letraMin')
var letraMai = document.getElementById('letraMai')
var numero = document.getElementById('numero')
var comprimento = document.getElementById('comprimento')

mensagem.style.display = 'none'
// Quando o usuário clicar no campo de campoSenhaCadastro, mostre a caixa de mensagem
campoSenhaCadastro.onfocus = function () {
  document.getElementById('mensagem').style.display = 'flex'
}

// Quando o usuário clicar fora do campo de campoSenhaCadastro, oculte a caixa de mensagem
campoSenhaCadastro.onblur = function () {
  document.getElementById('mensagem').style.display = 'none'
}

// Quando o usuário começa a digitar algo dentro do campo de campoSenhaCadastro
campoSenhaCadastro.onkeyup = function () {
  // Validação Letras Minusculas
  var letrasMinusculas = /[a-z]/g
  if (campoSenhaCadastro.value.match(letrasMinusculas)) {
    letraMin.classList.remove('invalid')
    letraMin.classList.add('valid')
    senhaMinCadastroEvalido = true
  } else {
    letraMin.classList.remove('valid')
    letraMin.classList.add('invalid')
    senhaMinCadastroEvalido = false
  }

  // Validação Letras Maiusculas
  var letrasMaiusculas = /[A-Z]/g
  if (campoSenhaCadastro.value.match(letrasMaiusculas)) {
    letraMai.classList.remove('invalid')
    letraMai.classList.add('valid')
    senhaMaiCadastroEvalido = true
  } else {
    letraMai.classList.remove('valid')
    letraMai.classList.add('invalid')
    senhaMaiCadastroEvalido = false
  }

  // Validação Numeros
  var numeros = /\d/g
  if (campoSenhaCadastro.value.match(numeros)) {
    numero.classList.remove('invalid')
    numero.classList.add('valid')
    senhaNumCadastroEvalido = true
  } else {
    numero.classList.remove('valid')
    numero.classList.add('invalid')
    senhaNumCadastroEvalido = false
  }

  // Validação Comprimento
  if (campoSenhaCadastro.value.length >= 8) {
    comprimento.classList.remove('invalid')
    comprimento.classList.add('valid')
    senhaTamCadastroEvalido = true
  } else {
    comprimento.classList.remove('valid')
    comprimento.classList.add('invalid')
    senhaTamCadastroEvalido = false
  }
}


// VALIDAÇÃO REPETIR SENHA

var campoRepetirSenhaCadastro = document.getElementById('conferirSenha')

campoRepetirSenhaCadastro.addEventListener('blur', function () {
  //Capturando o elemento <Small> do html
  var repetirSenhaValidacaoCadastro = document.getElementById(
    'repetirSenhaValidacaoCadastro'
  )
  if (
    campoRepetirSenhaCadastro.value != '' &&
    campoRepetirSenhaCadastro.value == campoSenhaCadastro.value
  ) {
    //Email tem informação
    repetirSenhaValidacaoCadastro.innerText = ''
    campoRepetirSenhaCadastro.style.border = ``
    repetirSenhaCadastroEValido = true
  } else {
    //Email está vazio
    repetirSenhaValidacaoCadastro.innerText = 'Senhas não coincidem'
    repetirSenhaValidacaoCadastro.style.color = 'rgba(255, 0, 0, 0.75)'
    repetirSenhaValidacaoCadastro.style.fontSize = '8'
    repetirSenhaValidacaoCadastro.style.fontWeight = 'bold'
    campoRepetirSenhaCadastro.style.border = `1px solid rgba(255, 0, 0, 0.75)`
    repetirSenhaCadastroEValido = false
  }
  validacaoTelaCadastro()
})

function validacaoTelaCadastro() {
  if (
    nomeCadastroEValido &&
    sobrenomeCadastroEValido &&
    emailCadastroEValido &&
    repetirSenhaCadastroEValido &&
    senhaMinCadastroEvalido && 
    senhaMaiCadastroEvalido && 
    senhaNumCadastroEvalido && 
    senhaTamCadastroEvalido
  ) {
    botaoCriarConta.removeAttribute('disabled')
    botaoCriarConta.innerText = 'Criar Conta'
    botaoCriarConta.style.background = '#7898FF'
    return true
  } else {
    botaoCriarConta.setAttribute('disabled', true)
    botaoCriarConta.innerText = 'Criar Conta'
    return false
  }
}

})