package exercicioSerie;

public class Main {
    public static void main(String[] args) {
        GradeDeSeriesProxy s = new GradeDeSeriesProxy(new GradeDeSeries());

        System.out.println("Teste de busca correta e exceção acima de 5 series:");
        try {
            s.getSerie("The Witcher");
            s.getSerie("Two And A Half Men");
            s.getSerie("Breaking Bad");
            s.getSerie("How i Meet Your Mother");
            s.getSerie("A Serie Das Batatas");
            s.getSerie("Vikings");
        } catch (SerieNaoHabilitadaException myException) {
            System.out.println("Exceção encontrada! [" + myException.getMessage() + "]");
        }

        System.out.println();

        System.out.println("Teste de busca incorreta:");
        try {
            s.getSerie("A Batata Suprema");
        } catch (SerieNaoHabilitadaException myException) {
            System.out.println("Exceção encontrada! [" + myException.getMessage() + "]");
        }

    }
}
