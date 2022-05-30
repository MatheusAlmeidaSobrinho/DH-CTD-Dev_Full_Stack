public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        pet adocaopet0 = new pet("Scot", "Ruffles", 2014, 5.5, true, true);

        pet adocaopet2 = new pet("Blu", "Vira-lata", 2020, 7.9, true, false);


        adocaopet0.imprimeDadosCachorro();
        adocaopet0.checaApto();
        System.out.printf("%n");

        adocaopet2.imprimeDadosCachorro();
        adocaopet2.checaApto();
        System.out.printf("%n");
    }
}