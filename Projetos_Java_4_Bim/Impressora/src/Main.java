public class Main {

    public static void main(String[] args) {
        Impressora impressora1 = new Impressora("Epson", "Usb", "10/10/2010", 5);
        Impressora impressora2 = new Impressora("Canom", "fio", "05/05/2005", 3);

        impressora1.displaytemFolha();
        impressora2.displaytemFolha();

        impressora2.usarFolha();
        impressora2.usarFolha();

        impressora2.displaytemFolha();

        impressora2.usarFolha();

        impressora2.displaytemFolha();

        impressora1.qtdFolhaDisp();
        impressora2.qtdFolhaDisp();
    }
}