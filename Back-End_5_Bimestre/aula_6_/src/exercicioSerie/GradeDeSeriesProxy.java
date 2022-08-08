package exercicioSerie;

public class GradeDeSeriesProxy implements IGradeDeSeries {
    private int qtdViews;
    private GradeDeSeries gradeDeSeries;

    public GradeDeSeriesProxy(GradeDeSeries gradeDeSeries) {
        this.gradeDeSeries = gradeDeSeries;
        qtdViews = 0;
    }

    @Override
    public String getSerie(String nomeBusca) throws SerieNaoHabilitadaException {
        String s = this.gradeDeSeries.getSerie(nomeBusca);
        if (qtdViews < 5) { //questionar por que <= quebra, e por que tem uma contagem a menos, talvez por come�ar da posi��o 0?
            qtdViews++;
            System.out.println("Buscando por: [" + nomeBusca + "] -> Serie encontrada! -> Seu link para acesso: [" + s + "]");
        } else
            throw new SerieNaoHabilitadaException("N�mero de reprodu��es permitidas por semana excedido!");
        return s;
    }

}


