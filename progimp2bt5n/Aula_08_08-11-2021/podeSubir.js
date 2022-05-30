//Crie uma função podeSubir() que receba dois parâmetros:
//- altura da pessoa;
//- se está acompanhada.
//Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode
//subir ou não, baseado nas seguintes condições:
//a) A pessoa deve medir mais de 1.40m e menos de 2 metros.
//b) Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
//c) Se a pessoa medir menos de 1.20m, não poderá subir, nem acompanhada.
function podeSubir(altura, acompanhante) {
  if (altura < 1.2 && altura > 2) {
    console.log('Acesso proibido por estar fora dos padrão de altura permitido')
  } else if (altura >= 1.2 && altura < 1.4 && acompanhante == true) {
    console.log(
      'Acesso liberado por estar com acompanhante e ter altura minima necessaria'
    )
  } else if (altura >= 1.2 && altura < 1.4 && acompanhante == false) {
    console.log(
      'Acesso proibido por estar sem acompanhante mesmo tendo altura minima necessaria'
    )
  } else if (altura >= 1.4 && altura <= 2) {
    console.log('Acesso liberado')
  } else {
    console.log('Não foi possivel compreender, digite valores validos')
  }
  return podeSubir
}

console.log(podeSubir(1.3, false))

podeSubir(1.35, true)
