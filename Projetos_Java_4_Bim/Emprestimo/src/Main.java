public class Main {

    public static void main(String[] args)
    {
        Emprestimo pessoa1 = new Emprestimo (99, "Steven", 1780.33);
        // Emprestimo pessoa2 = new Emprestimo (100, "Robert", 2843.84);


        pessoa1.cliente();
        pessoa1.clienteDeve();
        // pessoa2.cliente();
        // pessoa2.clienteDeve();

        pessoa1.jurosMensalDivida();
        pessoa1.clienteDeve();

        pessoa1.aumentarDivida();
        pessoa1.clienteDeve();

        pessoa1.quitarDivida();
        pessoa1.clienteDeve();


    }
}