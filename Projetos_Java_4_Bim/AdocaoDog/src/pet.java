    public class pet
    {
        private boolean estaApto;
        private String racaCachorro;
        private int anoNascimento;
        private double peso;
        private boolean possuiChip;
        private boolean estaFerido;
        private String nomeCachorro;

        public pet(String nomeCachorro, String racaCachorro, int anoNascimento, double peso, boolean possuiChip, boolean estaFerido)
        {
            this.nomeCachorro = nomeCachorro;
            this.racaCachorro = racaCachorro;
            this.anoNascimento = anoNascimento;
            this.peso = peso;
            this.possuiChip = possuiChip;
            this.estaFerido = estaFerido;
            cachorroPodeSerAdotado();
        }

        public int obterIdadeCachorro()
        {
            return 2022 - this.anoNascimento;
        }

        public boolean cachorroPossuiChip()
        {
            return this.possuiChip;
        }

        public void cachorroPodeSerAdotado()
        {
            if(this.peso >= 5.00 && !this.estaFerido)
            {
                this.estaApto = true;
            }
            else
            {
                this.estaApto = false;
            }
        }

        public void checaApto()
        {
            if(estaApto)
            {
                System.out.println("Este cachorro pode ser adotado!");
            }
            else
            {
                System.out.println("Este cachorro nao pode ser adotado...");
            }
        }

        public void imprimeDadosCachorro()
        {
            System.out.println("Nome: " + this.nomeCachorro);
            System.out.println("Idade: " + obterIdadeCachorro() + "anos");
            System.out.println("Peso: " + this.peso + "kg");
            System.out.println("Possui Chip? " + cachorroPossuiChip());
            System.out.println("Esta ferido? " + this.estaApto);
        }
    }

