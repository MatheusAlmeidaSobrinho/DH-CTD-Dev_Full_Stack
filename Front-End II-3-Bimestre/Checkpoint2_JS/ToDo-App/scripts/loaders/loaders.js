const spinner = {
    showSpinner: function () {
        // Selecionamos o body. Isto servirá para incorporar nosso spinner dentro do HTML
        const body = document.querySelector("body");

        // Selecionamos os divs do index para poder ocultar durante o carregamento
        const divLeft = document.querySelector('.left');
        const divRight = document.querySelector('.right');

        // Criamos nosso spinner
        const spinnerContainer = document.createElement("div");
        const spinner = document.createElement("div");

        // Atruibuimos os IDs a cada novo elemento, para poder manipular seus estilos
        spinnerContainer.setAttribute("id", "container-load");
        spinner.setAttribute("id", "load");

        // Ocultamos o formulario de registro
        divLeft.classList.add("hidden");
        divRight.classList.add("hidden");


        // Agregamos o Spinner a nosso HTML
        spinnerContainer.appendChild(spinner);
        body.appendChild(spinnerContainer);

        return;
    },
    removeSpinner: function () {
        // Selecionamos o body para poder remover o spinner do HTML
        const body = document.querySelector("body");

        // Selecionamos o formulario de registro para poder mostrar novamente
        const divLeft = document.querySelector('.left');
        const divRight = document.querySelector('.right');

        // Selecionamos o spinner
        const spinnerContainer = document.querySelector("#container-load");

        // Removemos o spinner do HTML
        if(spinnerContainer) {
            body.removeChild(spinnerContainer);
        }

        // Removemos a classe que oculta o formulário
        divLeft.classList.remove("hidden");
        divRight.classList.remove("hidden");
        return;
    }
}