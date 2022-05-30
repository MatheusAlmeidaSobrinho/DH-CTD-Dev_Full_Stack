//Ex1. O que cada expressão retorna?
//Dê uma olhada nestes exemplos e pense sobre o que cada um retorna:
!true // false
!false // true
!!false // false ( pq virou true e dps false)
!!true // true ( pq virou false e dps true)
!1 // 0 logo false
!!1 // 1 logo true
!0 // 1 logo true
!!0 // 0 logo false
!!'' // ''

let x = 5
let y = 9
x < 10 && x !== 5 // true  por que x é menor que 10 e x tem o mesmo operando e tipo
x > 9 || x === 5 //  true por que x nao é menor que 9 mais ele é igual em tipo truly e operando
!(x === y) // true por que x===y é false mais com o NOT vira true

//Ex2. O que cada expressão retorna?
//Sem testar no console, o que você acha que cada uma destas expressões irá retornar? Elas são true ou false?

let x = 10
let y = 'a'
y === 'b' || x >= 10 // false por que y não é ==="b" e porque  x não é >= 10 é somente =10

let x = 3
let y = 8
!(x == '3' || x === y) && !(y !== 8 && x <= y)
// FALSE  pois essa parte !(x == '3' || x === y) é false e  essa !(y !== 8 && x <= y)  é false
// como estão comparados com AND e a mesma so aceita true quando ambas forem true, logo FALSE

let str = ''
let msg = 'haha!'
let eBonito = 'false'
!((str || msg) && eBonito)
// FALSE pois (str || msg) ambas strings  e && eBonito tambem string
// chegando a conclusão que tudo é string sendo true usando o operador NOT ficando false
