import Enterprise.*;

public class Main
{
    public static void main(String[] args) {
        Gerente potato = new Gerente("Potato","Fries","12175143418", "potato@email.com", 1255, 1000.00, 500.00);
        Vendedor potato1 = new Vendedor("Alfa","Beta","43418468175", "alfa@email.com",2277,1000.00,250.00, 6);

        potato.dadosDoGerente();
        potato1.dadosDoVendedor();
    }
}