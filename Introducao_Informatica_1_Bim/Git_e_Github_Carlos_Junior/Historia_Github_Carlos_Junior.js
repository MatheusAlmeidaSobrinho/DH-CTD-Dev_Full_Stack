const GitHub = [
    "Linus Torvalds e sua equipe, para ter um sistema de versionamento semelhante ao BitKeeper, mas que fosse de graça e eficiente.",
    "A Microsoft chefiada por Satya Nadela, pelo compromisso com a liberdade e desenvolvimento de códigos. E monopolização do mercado, é claro ahahah.",
    "Sim, através de IDE's com Extensões e Aplicações externas."
];

const A = "Quem inventou o sistema de controle de versão Git e por quê?";
const B = "Quem atualmente é o dono do GitHub e por quê";
const C = "Existe outra maneira, além do terminal, de trabalhar com o Github?";

const invention = (x) => {
    switch (x) {
        case A:
            console.log(`Questão A : ${A}`)
            console.log(GitHub[0]);
            break;
        case B:
            console.log(`Questão B : ${B}`)
            console.log(GitHub[1]);
            break;
        case C:
            console.log(`Questão C : ${C}`)
            console.log(GitHub[2]);
            break;
        default:
            console.log("QUESTÃO INEXISTENTE. Tente A, B ou C na próxima vez.");
            break;
    };
};

invention(C);
